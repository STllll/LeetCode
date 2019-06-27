import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
    public static void main(String[] args){
        int[] num = new int[]{1,1,2};
        List<List<Integer>> result = allsort(num);
        System.out.println(result);

    }

    public static List<List<Integer>> allsort(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int[] visited = new int[nums.length];
         util( visited,nums, lists, new ArrayList<>());
        return lists;

    }

    public static void util(int[] visited, int[] nums, List<List<Integer>> lists, List<Integer>  list ) {
         if (list.size() == nums.length) {
                 lists.add(new ArrayList<>(list));
             return;
         }
            for(int i = 0; i < nums.length ; i++) {
                if(visited[i] == 1 || (i > 0 && visited[i-1] == 0 && nums[i-1] == nums[i])) continue;
                visited[i] = 1;
                list.add(nums[i]);
                util(visited,nums, lists, list);
                list.remove(list.size() -1);
                visited[i] = 0;
             }
    }
}
