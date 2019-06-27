package LeetCode;

import java.util.Scanner;

public class LongestEchoString {
    public static void main(String[] args){
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

}
