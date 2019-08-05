package wangyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class wangyi1823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            list.add(x1[i]);
        }
        for(int i = 0; i < n; i++) {
            y1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            x2[i] = sc.nextInt();
            list.add(x2[i]);
        }
        for(int i = 0; i < n; i++) {
            y2[i] = sc.nextInt();
        }
        Collections.sort(list);
        int max = 0;
        for(int i = 0; i < n; i++){
            int down = list.indexOf(x1[i]);
            int up = list.indexOf(x2[i]);
            while(up > 1 && list.get(up).equals(list.get(up - 1)) ) up--;
            while(down < n && list.get(down).equals(list.get(down + 1))) down++;
            int count = up -down == 0? 1: up - down ;
            if(count > max) max = count;
        }
        System.out.println(max);
    }
}
