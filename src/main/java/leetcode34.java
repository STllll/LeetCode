public class leetcode34 {
    /*public int[] searchRange(int[] nums, int target) {
        int down = 0;
        int up = nums.length - 1;
        int mid = 0;
        int[] result = new int[]{-1,-1};
        if(nums.length == 0) return result;
        while(down < up) {
            mid = down +(up - down) /2 ;
            if(nums[mid] == target) break;
            if(nums[mid] > target) up = mid - 1;
            else if(nums[mid] < target) down = mid + 1 ;
        }
        if(nums[down] == target) mid = down;
        down = mid;
        up = mid;
        while(down > 0 && nums[down] == nums[down - 1]) down--;
        while(up < nums.length - 1 && nums[up] == nums[up + 1]) up++;
        if(nums[mid] == target){
            result[0] = down;
            result[1] = up;
        }

        return result;
    }*/
    public static void main(String[] args) {
        int[] number = new int[]{2,2};
        int[] result = searchRange(number, 8);
        for(int a: result) System.out.println(a);
    }
    public static int[] searchRange(int[] nums, int target) {
                int[] result = new int[2];
                int left = left_search(nums, target);
                left = left == 1? -1 : left;
                int right = right_search(nums,target);
                right = right == 0? -1: right;
              return  new int[]{left, right};
    }

    public static int left_search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int down = 0;
        int up = nums.length;
        while(down < up) {
            int mid = (down + up) /2;
            if(nums[mid] == target) {
                up = mid;
            } else if (nums[mid] < target) {
                down = mid + 1;
            } else if(nums[mid] > target) {
                up = mid;
            }
        }
        if(down == nums.length) return -1;
        return nums[down ] == target? down : -1;
    }
    public static int right_search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int down = 0;
        int up = nums.length;
        while(down < up) {
            int mid = (down + up) /2;
            if(nums[mid] == target) {
                down = mid + 1;
            } else if (nums[mid] < target) {
                down = mid + 1;
            } else if(nums[mid] > target) {
                up = mid;
            }
        }
        if(down == 0) return -1;
        return nums[down - 1] == target? down- 1 : -1;
    }
}