import java.util.ArrayList;
import java.util.Collections;

/*Given two positive integer n and  k, check if the kth index bit of n is set or not.
 Note: A bit is called set if it is 1.  */

public class CheckBit {
    public static void main(String args[]){
        System.out.println(checkKthBit(4, 0));
        System.out.println(checkKthBitBEST(4, 0));

    }

    public static boolean checkKthBitBEST(int n, int k){
        int a = n>>k;
        return (a&1)==1;
    }
    
    public static boolean checkKthBit(int n, int k) {
        int arr[] = convert(n);
        int find = arr.length-1-k;
        if(find<0){
            return false;
        }
        return arr[find]==1;
    }
    
    public static int[] convert(int x){
        ArrayList<Integer> list = new ArrayList<>();
        while(x>1){
            list.add(x%2);
            x = x/2;
        }
        list.add(x);
        Collections.reverse(list); 
        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
