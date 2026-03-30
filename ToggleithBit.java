public class ToggleithBit {
    public static void main(String args[]){
        System.out.println(toggle(13, 2));

    }

    public static int toggle(int n, int k){
        int a = 1<<k;
        return n^a;

    }
}
