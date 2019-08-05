package wangyi;

import java.util.Scanner;

public class wangyi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] value = new int[n];
        int[] sleep = new int[n];
        int knowledge = 0;
        for(int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        for(int j = 0 ; j < n; j++) {
            sleep[j] = sc.nextInt();
            if(sleep[j] == 1) knowledge += value[j];
        }
        //清醒的分数已经得到，下面求叫醒睡觉得到的分数
        int wakePoint = 0;
        for(int i = 0; i < n; i++) {
            int temp = 0;
            if(sleep[i] == 0) {
                temp = getWakePoint(value, sleep, i, m);
                if(temp > wakePoint) wakePoint = temp;
                if((i + m) > n ) break;
            }
        }
        int result = wakePoint + knowledge;
        System.out.println(result);

    }

    public static int getWakePoint(int[] value, int[] sleep, int i, int m) {
        int temp = 0;
        int up = i + m;
        while(i < value.length && i < up) {
            if(sleep[i] == 0) temp += value[i];
            i++;
        }
        return temp;
    }
}
