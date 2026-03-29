public class BinaryToDecimal {
    public static void main(String args[]){
        System.out.println(convert("111"));
    }

    public static int convert(String s){
        int sum = 0;
        for(int i=s.length()-1;i>=0;i--){
            int c = s.charAt(i) - '0';
            sum+=Math.pow(2, s.length()-1-i)*c;
        }
        return sum;
    }

}
