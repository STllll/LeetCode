import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findSpinSmallest154 {
    public static void main(String[] args) {
        int[] number = new int[]{1,1}; //2,0,1,1,1
        int result = findMin(number);
        System.out.println(result);
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int min = Integer.MAX_VALUE;
        while (low < high) {
            mid = low + (high - low) / 2;
            if(nums[mid] == nums[low]) {  //有序
                min = Math.min(min,nums[low]);
                low++;
            } else if (nums[mid] > nums[low]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                high = mid;
            }
        }
        if (low != nums.length) {
            min = Math.min(min, nums[low]);
        }
        return min;
    }
}
