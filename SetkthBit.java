public class SetkthBit {

    public static void main(String args[]){
        int n = 10;
        int k = 2;
        System.out.println(setKthBit(n, k));
    }

    public static int setKthBit(int n, int k) {
        // code here
        int b = 1<<k;
        return n|b;
    }
}
