public class NoOfSetBits {
    public static void main(String args[]){
        System.out.println(count(11));
    }
    public static int count(int n) {
        int c = 0;
        while(n>0){
            if((n&1)==1){
                c++;
            }
            n = n>>1;
        }
        return c;
    }
}
