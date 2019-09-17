package wangyigame;

import java.text.DecimalFormat;
import java.util.Scanner;

public class disiti {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double min = 1;
            int[] mark = new int[n + 1];
            mark[1] = 1;
            for(int i = 2; i < n + 1; i++) {
                int count = 1;
                int start = 2;
                for(int z = 2; z < i / 2; z++) {
                    if(i % z == 0) {
                        count = mark[i / z];
                        start = i / z + 1;
                    }
                }
                for(int j = start; j < i; j++) {
                    if(simple(j, i)) count++;
                }
                if((double)count / i < min) min = (double)count / i ;
                mark[i] = count;
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.000000");
            String result = decimalFormat.format(min);
            System.out.println(result);
        }

        public static boolean simple(int j, int i) {
            for(int k = 2; k <= j / 2; k++) {
                if(j % k == 0 && i % k == 0) return false;
            }
            return true;
        }
    }


