package wangyi;

import java.util.*;

public class wangyi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] tower = new int[n][2];
        for (int i = 0; i < n; i++) {
            tower[i][0] = sc.nextInt();
            tower[i][1] = i + 1;
        }
        sort1(tower);
        int height = (tower[n-1][0] - tower[0][0]);
        int time = 0;
        List<Integer> list = new ArrayList<>();
        while((tower[n-1][0] - tower[0][0]) >= 2 && time < k) {
            tower[n - 1][0]--;
            tower[0][0]++;
            list.add(tower[n - 1][1]);
            list.add(tower[0][1]);
            time++;
            sort1(tower);
            height = (tower[n-1][0] - tower[0][0]);
        }
        System.out.print(height +" ");
        System.out.println(time);
        for(int i =0; i < list.size(); i++){
            System.out.print(list.get(i++)+" ");
            System.out.println(list.get(i));
        }

    }

    public static void sort1(int[][] tower) {
        Arrays.sort(tower, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
    }
}
