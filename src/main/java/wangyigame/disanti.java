package wangyigame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class disanti {
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] deadline = new int[n];
        int[] cost = new int[n];
        boolean[] used = new boolean[n];
        for(int i = 0; i < n; i++) {
            deadline[i] = sc.nextInt();
            cost[i] = sc.nextInt();
        }
         findPath(0, 0,deadline, cost, n, 0, used);
        System.out.println(min);
    }

    public static void findPath(int day, int delay,int[] deadline, int[] cost, int n, int index, boolean[] used) {
          if(index == n) {
              if(delay < min) min = delay;
          }
          else {
              for (int i = 0; i < n; i++) {
                  if (!used[i]) {
                      used[i] = true;
                      day += cost[i];
                      if (day - deadline[i] > 0) delay += day - deadline[i];
                      if (delay > min) {
                          return;
                      }
                      findPath(day, delay, deadline, cost, n, index + 1, used);
                      //一定要记得回溯状态
                      used[i] = false;
                      if(day - deadline[i] > 0) delay -= day - deadline[i];
                      day -= cost[i];
                  }
              }
          }
    }



}
