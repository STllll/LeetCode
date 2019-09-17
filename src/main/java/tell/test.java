package tell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String a = "acaaa";
        System.out.println(longestPalindromeSubseq(a));
    }

    public static int longestPalindromeSubseq(String s) {
        int maxLen = 1;
        int swaptime = 0;
        for(int i = 0; i < s.length() / 2 + 2; i++) {
            if(i == s.length() / 2 + 1) {
                StringBuffer stringBuffer = new StringBuffer(s);
                s = stringBuffer.reverse().toString();
                i = 0;
                swaptime++;
                continue;

            }
            if(swaptime == 2) break;
            if(i > 0 && i < s.length() - 1&& s.charAt(i) == s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1) ) {
                String stemp = s.substring(0, i );
                char[] chr = stemp.toCharArray();
                int templen = 2;
                int k = chr.length - 2;
                for(int z = i + 1; z < s.length(); z++) {
                    if(k < 0) break;
                    if(s.charAt(z) == chr[k]) {
                        templen += 2;
                        k--;
                    }
                }
                if(templen > maxLen) {
                    maxLen = templen;
                }
            }
            else if( i > 0 && s.charAt(i) != s.charAt(i - 1) || (i > 0 && i < s.length() - 1 && s.charAt(i) == s.charAt(i -1) && s.charAt(i) == s.charAt(i + 1)) ) {
                String stemp = s.substring(0, i );
                char[] chr = stemp.toCharArray();
                int templen = 1;
                int k = chr.length - 1;
                for(int z = i + 1; z < s.length(); z++) {
                    if(k < 0) break;
                    if(s.charAt(z) == chr[k]) {
                        templen += 2;
                        k--;
                    }
                }
                if(templen > maxLen) {
                    maxLen = templen;
                }
            }
        }
        return maxLen;
    }
}
