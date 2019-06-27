public class findsmallest153 {
    public static void main(String[] args){
         int[] nums = new int[]{3,1,2}; //4,5,6,7,0,1,2  4,5,6,7,0,1,2
         int result = findMin(nums);
         System.out.println(result);
    }

    public static int findMin(int[] nums) {
            int n = nums.length;
            int low = 0;
            int high = n-1;

            while(low < high) {
                int mid = low + (high - low) / 2;
                if(nums[mid] > nums[high]) {
                    low = mid + 1;
                    if(nums[low] < nums[mid]) return nums[low];
                } else high = mid;


            }
            return nums[low];
    }
}
