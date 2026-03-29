import java.util.*;

public class DecimalToBinary {
    
    public static void main(String args[]){
        System.out.println(convert(13));
    }

    public static ArrayList<Integer> convert(int x){
        ArrayList<Integer> list = new ArrayList<>();
        while(x>1){
            list.add(x%2);
            x = x/2;
        }
        list.add(x);
        Collections.reverse(list); 
        return list;
    }
}
