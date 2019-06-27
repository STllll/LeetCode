package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum40 {
    public static void main(String[] args){
        int[] canditates = new int[]{10,1,2,7,6,1,5};
         List<List<Integer>> result = combinationSum2(canditates,8);
         System.out.println(result);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
               List<List<Integer>> lists = new ArrayList<>();
                   List<Integer> tem = new ArrayList<>();
                 util(candidates, target, 0,lists,tem,0);
               return  lists;
    }

    public static void util(int[] candidates, int target, int start,  List<List<Integer>> lists,  List<Integer> tem, int i) {
        for(int j = i; j < candidates.length; j++) {
            start += candidates[j];
            if(start > target) {
                break;
            }
            if(start == target) {
                tem.add(candidates[j]);
                if(!lists.contains(tem))
                lists.add(new ArrayList<>(tem));
                tem.remove(tem.size() - 1);
                break;
            }
            if(start < target) {
                tem.add(candidates[j]);
                util(candidates, target, start, lists, tem, j+1);
                tem.remove(tem.size() - 1);
                start -= candidates[j];
            }
        }

    }
}
