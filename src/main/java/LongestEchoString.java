import java.util.Scanner;

public class LongestEchoString {
   /* public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          String s = sc.next();
           String result = longestPalindrome(s);
           System.out.println(result);
    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        String result = "";
        boolean[][] booleans = new boolean[n][n];
        for(int i = 0; i < n ; i++) {
            for(int j = i; j >= 0 ; j--) {
                if(s.charAt(i) == s.charAt(j) &&  ((i-j < 2) || booleans[i-1][j+1] )){
                    booleans[i][j] = true;
                }
                if(booleans[i][j] && ((i-j+1) > result.length()) ){
                    result = s.substring(j, i+1);
                }
            }
        }
        return result;
    }
*/
   public static void main(String[] args) {
       System.out.println(longestPalindrome("abbad"));
   }
    public static String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0) return "";
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++) {
            int len1 = helper(s, i, i);
            int len2 = helper(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int helper(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
