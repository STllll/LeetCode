package tencent50;

public class productExceptSelf238 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] result = productExceptSelf(nums);
        for(int a : result) System.out.println(a);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] multify = new int[nums.length];
        int[] result = new int[nums.length];
        int k = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for(int i = nums.length - 1 ; i >= 0; i--) {
            result[i] *= k;
            k = k * nums[i];

        }
        return result;
    }
}
