package pinduoduo2;

import java.util.Arrays;
import java.util.Scanner;

public class pinduoduo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        int count = n * m - 1;

        if (t >= n * m) {
            return;
        }
        int[] array = new int[n * m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i * m + j] = + j * (i + 1) + i + 1 ;
            }
        }
        Arrays.sort(array);

        System.out.println(array[count - t + 1]);
    }
}



