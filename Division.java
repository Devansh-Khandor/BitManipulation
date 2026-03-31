public class Division {

    public static void main(String args[]){
        System.out.println(divide(10, 3));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == divisor) {
            return 1;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = true;
        if (dividend >= 0 && divisor < 0) sign = false;
        if (dividend < 0 && divisor > 0) sign = false;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {
            int cut = 0;

            while (n >= (d << (cut + 1))) {
                cut++;
            }

            ans += (1L << cut);
            n = n - (d << cut);
        }

        return sign ? (int) ans : (int) (-ans);
    }
}
