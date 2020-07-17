import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sumnumber39 {
    public static void main(String[] args) {
        int[] num = new int[]{2,3,5};
        int target = 8;
        System.out.println(combinationSum(num, target));
    }
    public static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        solution(candidates, target, 0, new ArrayList<Integer>());
        return result;
    }

    public static void solution(int[] candidates, int target, int sum, List<Integer> list) {
        if(sum == target  ) {
            Collections.sort(list);
            if(!result.contains(list))  result.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = 0; i < candidates.length; i++) {
            sum += candidates[i];
            list.add(candidates[i]);
            if(sum > target){
                list.remove(list.size() - 1);
                sum -= candidates[i];
                return;
            }
            solution(candidates, target, sum, list);
            list.remove(list.size() - 1);
            sum -= candidates[i];
        }
    }
}
