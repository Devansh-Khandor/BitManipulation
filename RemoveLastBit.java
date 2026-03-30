public class RemoveLastBit {
    public static void main(String args[]){
        System.out.println(remove(12));
        System.out.println(removeOPTIMAL(12));
    }

    public static int remove(int n){
        if(n==0){
            return 0;
        }
        int a = n;
        int i = 0;
        while((a&1)!=1){
            a = a>>1;
            i++;
        }
        int b = 1<<i;
        return n^b;
    }

    public static int removeOPTIMAL(int n){
        return n&(n-1);
    }
}
