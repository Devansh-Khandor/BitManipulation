import java.util.ArrayList;
import java.util.List;

/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order. */

public class PowerSet {
    public static void main(String args[]){
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] arr) {
        int len = arr.length;
        int subsets = 1<<len; // this basically gives us 2^len
        List<List<Integer>> result = new ArrayList<>();
        for(int num=0;num<subsets;num++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<len;i++){
                if((num&(1<<i))!=0){
                    list.add(arr[i]);
                }
            }
            result.add(list);
        }
        return result;
    }
}
