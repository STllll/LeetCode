import java.util.HashMap;

public class leetcode560 {
    public static void main(String[] args) {
        int[] num = new int[]{1,1,1};
        Solution so = new Solution();
        System.out.println(so.subarraySum(num,2));
    }

    static class Solution {

        public int subarraySum(int[] nums, int k) {
            int sum  = 0;
            if (nums == null || nums.length == 0) return 0;
            //dp[i]表示前i个数的和
            int[] dp = new int[nums.length + 1];
            for (int i = 1; i <= nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i - 1];
            }
            int ret = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < dp.length; i++) {
                if (map.containsKey(dp[i] - k))
                    ret += map.get(dp[i] - k);
                map.put(dp[i], map.getOrDefault(dp[i], 0) + 1);
            }
            return ret;


        }

    }
}
