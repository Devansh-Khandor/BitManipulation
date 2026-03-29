public class ClearithBit {
    public static void main(String args[]){
        System.out.println(replaceBit(13, 2));
    }

    public static int replaceBit(int N, int k) {
        int a = 1<<k;
        a = ~a;
        return N&a;
    }
}
