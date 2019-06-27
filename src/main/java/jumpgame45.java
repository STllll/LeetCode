public class jumpgame45 {
    public static void main(String[] args){
        int[] nums = new int[]{2,3,1,1,4};//
        int result = jump(nums);
        System.out.println(result);
    }

    public static int jump(int[] nums) {
        int[] result = new int[1];
        int n = nums.length-1;
        result[0] = n;
        util(nums,result, 0, n, 0);
        return result[0];
    }

    public static void util(int[] nums, int[] result, int i, int n, int count) {
        int jump = nums[i];
        count++;
        if((i + jump) >= n) {
            if (count < result[0]) result[0] = count;
        } else {
            int max = 0;
            int index = i;
            for (int j = i; j <= i + jump; j++) {
                if ((j + nums[j]) > max) {
                    max = j + nums[j];
                    index = j;
                }
            }
            util(nums, result, index, n, count);
        }
    }
}
