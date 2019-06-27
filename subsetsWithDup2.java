package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup2 {
    public static void main(String[] args){
            int[] nums = new int[]{4,1,4,4,4};
            List<List<Integer>> result = subsetsWithDup(nums);
            List<Integer> list = new ArrayList<>();

            System.out.println(result);
    }

    public static  List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        int[] visited = new int[nums.length];
        util(lists, tem, nums, 0,visited);//递归入口
        lists.add(new ArrayList<>());
        for(int a : nums) tem.add(a);
        return lists;
    }

    public static void util( List<List<Integer>> lists, List<Integer> tem, int[] nums, int i, int[] visited) {
             if(tem.size() == nums.length) return;
             for(int j = i; j < nums.length; j++) {
                 if(j > i && nums[j] == nums[j - 1]) continue;
                 tem.add(nums[j]);
                     lists.add(new ArrayList<>(tem));
                 util(lists, tem, nums, j+1,visited);
                 tem.remove(tem.size()-1);
             }
    }
}
