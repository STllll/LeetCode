package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class uglyNumber264 {
    public static void main(String[] args){
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int t2 = 0; int t3 = 0; int t5 = 0;
        for(int i = 1; i < n; i++) {
            int recentnumber = min(list.get(t2) * 2, list.get(t3) * 3,list.get(t5) * 5);
            list.add(recentnumber);
            if(list.get(i) == list.get(t2) * 2) t2++;
            if(list.get(i) == list.get(t3) * 3) t3++;
            if(list.get(i) == list.get(t5) * 5) t5++;
        }

        if (n == 0) return 0;
        else return list.get(n - 1);
    }

    public static int min(int a,  int b, int c) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(b,c);
        return min1 < min2? min1 : min2;
    }
}
