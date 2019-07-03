import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class longestLIS300 {
    public static void main(String[] args){
           int[] nums = new int[]{9,8,2,5,3,7,101,18};
           int result = lengthOfLIS(nums);
           System.out.println(result);
    }


      /*
      *  方法一:二分法 时间复杂度NlogN
      * */
//    public static int lengthOfLIS(int[] nums) {
//        int[] result = new int[nums.length];
//        int max = 0;
//        for(int a : nums) {
//            int low = 0;
//            int high = max;
//            while(low < high) {
//                int mid = low + (high - low) / 2;
//                if(result[mid] < a) low = mid + 1;
//                else high = mid;
//            }
//            result[low] = a;
//            if(low == max) max++;
//        }
//        return  max;
//    }

    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len < 2) return len;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for(int i = 1; i < len; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int res = dp[0];
        for(int i = 1; i < len; i++) {
            if(res < dp[i]) res = dp[i];
        }
        return res;
    }
}
