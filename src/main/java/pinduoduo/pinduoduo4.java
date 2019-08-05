package pinduoduo;

import java.util.Scanner;

public class pinduoduo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] origin = new int[n];
        int[] change = new int[n];
        for(int i = 0; i < n; i++){
            origin[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            change[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[0] = change[0];
        int cnt = 1;
        for(int j = 1; j < n; j++) {
            if(origin[j] > origin[j - 1] && dp[j - 1] <= 7 * change[j]) {
                dp[j] = dp[j - 1] + change[j];
                cnt++;
            } else {
                dp[j] = dp[j - 1];
            }
        }
        System.out.println(cnt);

    }
}
