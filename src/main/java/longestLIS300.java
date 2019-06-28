import java.util.ArrayList;
import java.util.Collections;

public class longestLIS300 {
    public static void main(String[] args){
           int[] nums = new int[]{10,9,2,5,3,7,101,18};
           int result = lengthOfLIS(nums);
           System.out.println(result);
    }

    public static int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        int max = 0;
        for(int a : nums) {
            int low = 0;
            int high = max;
            while(low < high) {
                int mid = low + (high - low) / 2;
                if(result[mid] < a) low = mid + 1;
                else high = mid;
            }
            result[low] = a;
            if(low == max) max++;
        }
        return  max;
    }
}
