public class XORofNumbersInARange {
    public static void main(String args[]){
        System.out.println(xor(5));
        System.out.println(xor(6));
        System.out.println(xor(7));
        System.out.println(xor(8));
    }

    public static int xor(int n){
        if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }
        else{
            return n;
        }
    }
}
