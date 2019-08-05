package wangyi;

import java.util.Scanner;

public class wangyi1822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = n; i >= 1 ; i--) {
            if(i < k) continue;
            for(int j = 1; j <= n; j++){
                if(i < j && i < k) break;
                if(i < j) {
                    count += n - i;
                    break;

                }
                if(i % j >= k) count++;
            }
        }
        System.out.println(count);
    }
}
