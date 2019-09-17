public class differentpath63 {
    public static void main(String[] args) {
        int[][] number = new int[][]{{1}};
        System.out.println(uniquePathsWithObstacles(number));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0] == 1) return 0;
        for(int k = 0; k < m; k++) {
            if(obstacleGrid[k][0] != 1) dp[k][0] = 1;
            else break;
        }
        for(int z = 0; z < n; z++) {
            if(obstacleGrid[0][z] != 1) dp[0][z] = 1;
            else break;
        }
        for(int i = 1; i < m; i++ ) {
            for(int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
