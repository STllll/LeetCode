package tencent50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class threeSum15 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,-2,-1}; //-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3
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
            if(list.get(i) >= 0) break;
            List<Integer> temp = new ArrayList<>();
            two = i + 1;
            while (two < nums.length - 1) {
                int sum = list.get(i) + list.get(two);
                if(sum > 0) break;
                if(list.get(i) + list.get(two) + list.get(nums.length - 1) < 0 ) {
                    two++;
                    continue;
                }
                int target = 0 - sum;
                if(list.contains(target) && target >= list.get(two) && list.lastIndexOf(target) != two){
                        temp.add(list.get(i));
                        temp.add(list.get(two));
                        temp.add(-sum);
                        if(!result.contains(temp))
                        result.add(new ArrayList<>(temp));
                        temp.clear();
                    }
                two++;
            }
        }
        return result;
    }
}
