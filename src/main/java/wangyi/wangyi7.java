package wangyi;

import java.util.Scanner;

public class wangyi7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        int sum = 1;
        int he = a + z;
        int shang = 1;
        for(int i = a; i > 0; i--){
            sum *= he;
            shang *= a;
            he--;
        }
        int all = sum / shang;
        if(k > all) {
            System.out.println("-1");
            return;
        }
        int[] string = new int[he];
        int count = 0;
        int marka = a;
        int markz = z;
        while(count != k) {

        }
    }
}
