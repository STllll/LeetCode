package LeetCode;

import java.util.Arrays;
import java.util.concurrent.CompletionStage;

public class CloseThreeNumberNum {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,4,8,16,32,64,128};
        int target = 82;
       int result = threeSumClosest(nums, target);
        System.out.println(result);
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for(int i = 0; i< nums.length-2; i++) {
            int l = i+1;
            int r = nums.length - 1 ;
              while( l < r) {
                  int threeNum = nums[i] + nums[l] +nums[r];
                  if(Math.abs(threeNum - target) < Math.abs(result - target)) {
                      result = threeNum;
                  }
                  if(threeNum < target) {
                      l++;
                  } else if(threeNum > target) {
                      r--;
                  } else return target;
              }
        }
        return result;
    }
}
