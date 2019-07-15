package tencent50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class threeSum15 {
    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
              int one = 0;
              int two = 1;
              List<Integer> list = new ArrayList<>();
              for(int a : nums) list.add(a);
        Collections.sort(list);
        for(int i = one; i < nums.length - 2; i++) {
            List<Integer> temp = new ArrayList<>();
            two = i + 1;
            while (two < nums.length - 1) {
                for (int j = two + 1; j < nums.length; j++) {
                    int sum = list.get(i) + list.get(two) + list.get(j);
                    if (sum == 0) {
                        temp.add(list.get(i));
                        temp.add(list.get(two));
                        temp.add(list.get(j));
                        if(!result.contains(temp))
                        result.add(new ArrayList<>(temp));
                        temp.clear();
                    }
                }
                two++;
            }
        }
        return result;
    }
}
