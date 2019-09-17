package wangyigame;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class sortjuxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] h = new int[n];
        int[] squre = new int[n];
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            h[i] = sc.nextInt();
            squre[i] = w[i] * h[i];
        }
        int[] sort = new int[n];
        for(int i = 0; i < n; i++) {
            sort[i] = i;
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = n - 1; j > i; j--) {
                double hw1 = Math.min((float) w[sort[j]] / h[sort[j]], (float) h[sort[j]] / w[sort[j]]);
                double hw2 = Math.min((float) w[sort[j - 1]] / h[sort[j-1]], (float) h[sort[j - 1]] / w[sort[j - 1]]);
                if(squre[sort[j]] < squre[sort[j- 1]]) {
                    int temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;
                }
                else if(squre[sort[j]] == squre[sort[j- 1]] && hw1 > hw2) {
                    int temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;
                }
                else if(squre[sort[j]] == squre[sort[j- 1]] && hw1 == hw2 && w[sort[j]] < w[sort[j - 1]]) {
                    int temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;
                }
            }
        }
        for(int i = 0; i < n - 1; i++) {
            System.out.print(w[sort[i]] + " ");
            System.out.print(h[sort[i]] + " ");
        }
        System.out.print(w[sort[n - 1]] + " ");
        System.out.print(h[sort[n - 1]]);
    }
}
