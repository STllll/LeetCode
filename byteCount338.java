package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class byteCount338 {
    public static void main(String[] args){
           int[] result = countBits(3);

    }

    public static int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i = 1; i <= num; i++) {
            res[i] = res[i & i - 1] + 1;
        }
        return res;
    }
}
