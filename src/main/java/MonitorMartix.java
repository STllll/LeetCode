import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonitorMartix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = sc.nextInt();
        int result = util(nums, target);
        System.out.println(result);
    }

    public static int util(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        //System.out.println(left);
        int split_t = left;
        left = 0;
        right = nums.length - 1;
        if (nums[split_t] <= target && target <= nums[right]) left = split_t;
        else right = split_t;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
    }

