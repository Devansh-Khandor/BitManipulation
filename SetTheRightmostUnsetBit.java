public class SetTheRightmostUnsetBit {
    public static void main(String args[]){
        System.out.println(setBit(13));
    }
    public static int setBit(int n) {
        // code here
        int a = n;
        int i = 0;
        while((a&1) != 0){
            i++;
            a = a>>1;
        }
        int b = 1<<i;
        return n|b;
    }
}
