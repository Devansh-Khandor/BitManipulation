import java.util.ArrayList;
import java.util.List;

public class SwapNos {

    public static void main(String args[]){
        System.out.println(get(13, 9));
    }

    public static List<Integer> get(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
}
