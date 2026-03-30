public class CheckIfPowerOf2 {
    public static void main(String args[]){
        System.out.println(check(32));
    }
    public static boolean check(int n){
        return n>0 && (n&(n-1))==0;
    }
}
