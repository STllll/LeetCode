package LeetCode;

public class findPeek162 {
    public static void main(String[] args){
            int[] nums = new int[]{1,2,1,3,5,6,4};
            int result =findPeakElement(nums);
            System.out.println(result);
    }

    public static int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while(left < right) {
                int mid = (left + right) / 2;
                if(nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                }
                if(nums[mid] > nums[mid + 1]) {
                    right = mid;
                }
            }
            return left;
    }
}
