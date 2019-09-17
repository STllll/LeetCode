package pinduoduo2;

import java.util.*;

public class pinduoduo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace(';',',');
        String[] str = s.split(",");
        int n = str.length;
        Integer[] result = new Integer[n - 1];
        for(int i = 0; i < n - 1; i++) {
            result[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 2 == 0 && o2 % 2 == 0) {
                    return o2 - o1;
                }
                if(o1 % 2 == 1 && o2 % 2 == 1) return o2 - o1;
                if(o1 % 2 == 0 && o2 % 2 == 1) return -1;
                if(o1 % 2 == 1 && o2 % 2 == 0) return 1;
                return 0;
            }
        });
        for(int j = 0; j < Integer.parseInt(str[n - 1])- 1;j++){
            System.out.print(result[j] + ",");
        }
        System.out.print(result[Integer.parseInt(str[n-1]) - 1]);
    }
}
