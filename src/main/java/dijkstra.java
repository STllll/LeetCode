public class dijkstra {
    public static void main(String[] args){
        int[][] nums = new int[][]{{0,2,6,5},{2,0,4,4},{6,4,0,2},{5,4,2,0}};
        System.out.println(dj(4,nums));
    }

    public static int  dj(int k, int[][] nums) {
        int n = nums.length;
        int[] shortLength = new int[n];
        int[] visited = new int[nums.length];

        shortLength[0] = 0;
        visited[0] = 0;

        for(int i = 1; i < k; i++) {
            int j = -1;
            int temp = Integer.MAX_VALUE;
            for(int t = 0; t < n; t++) {
                if(visited[t] == 0 && nums[0][t] < temp) {
                    temp = nums[0][t];
                    j =  t;
                }
            }

            shortLength[j] = temp;
            visited[j] = 1;
            for(int t = 0; t < n; t++) {
                if (visited[t] == 0 && nums[0][t] + nums[j][t] < nums[0][t]) {
                    nums[0][t] = nums[0][t] + nums[j][t];
                }
            }
        }
        int sum = 0;
        for(int a : shortLength){
            sum += a;
        }
        return  sum;
    }
}
