public class longestpalindsubseq {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if( n == 0) return 0;
        int[][] f = new int[n][n];
        for(int i = n -1; i >= 0; i--) {
            for(int j = i; j < n; j++) {
                f[i][j] = 1;
                if(i < n - 1 && j > i && s.charAt(i) == s.charAt(j)) {
                    f[i][j] = f[i + 1][j - 1] + 2;
                } else {
                    f[i][j] = Math.max(f[i + 1][j], f[i][j - 1]);
                }
            }
        }
        return f[0][n - 1];
    }
}
