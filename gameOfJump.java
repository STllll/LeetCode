package LeetCode;

public class gameOfJump {
    public static void main(String[] args){
//         int[] nums = new int[]{3,2,1,0,4};
//        int[] nums = new int[]{2,3,1,1,4};
//        int[] nums = new int[]{3,2,1,0,4};
//        int[] nums = new int[]{2,0,2,0,1};
        int[] nums = new int[]{5,9,3,2,1,0,2,3,3,1,0,0};
        boolean result = canJump(nums);
         System.out.println(result);

    }

    public static  boolean canJump(int[] nums) {
        int n = nums.length;
        boolean result = false;
        result = util(nums, 0, n - 1);
        return result;
    }

    public static boolean util(int[] nums, int i, int target ){
        int jump = nums[i];
        if( i + jump >= target) return true;
        int maxjump = 0;
        int maxqidian = 0;
         boolean result = false;
             if(jump == 0) return false;
             int j = i +1 ;
             for(; j < i + jump +1 ; j++) {// 寻找能到达的能跳的最远的一个
                  if(nums[j] + j > maxjump) {
                      maxjump = nums[j] + j;
                      maxqidian = j;
                  }
             }
           result = util(nums, maxqidian,target);
         return result;
    }
}
