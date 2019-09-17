package swordToOffer;

import java.util.Scanner;

public class brace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int n = sc.nextInt();
        int[][] sea = new int[row][col];
        int count = 0;
        for(int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r < 0 || r >= row || c < 0 || c >=col) {
                if(i != n -1)
                    System.out.print(count + " ");
                else System.out.print(count);
                continue;
            }
            if(sea[r][c] == 1) {
                if(i != n -1)
                    System.out.print(count + " ");
                else System.out.print(count);
                continue;
            }
            count++;
            sea[r][c] = 1;
            if(c - 1 > -1 && sea[r][c-1] == 1) {
                    if(count != 1)count--;
            }
            if(c + 1 < col && sea[r][c+1] == 1) {
                if(count != 1)count--;
            }
            if(r - 1 > -1 && sea[r - 1][c] == 1) {
                if(count != 1)count--;
            }
            if(r + 1 < row && sea[r + 1][c] == 1) {
                if(count != 1)count--;
            }
            if(i != n -1)
            System.out.print(count + " ");
            else System.out.print(count);
        }
        sc.close();
    }
}
