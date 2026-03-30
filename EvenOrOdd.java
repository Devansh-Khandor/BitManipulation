public class EvenOrOdd {

    public static void main(String args[]){
        System.out.println(isEven(4));
        System.out.println(isEven(3));
    }
    
    public static boolean isEven(int n) {
        // code here
        if((n&1)==1){
            return false;
        }
        return true;
    }
}
