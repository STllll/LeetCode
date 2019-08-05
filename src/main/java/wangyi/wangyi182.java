package wangyi;

import java.util.*;

public class wangyi182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] mark = new int[N][2];
        for(int i = 0; i < N; i++) {
            mark[i][0] = sc.nextInt();
            mark[i][1] = sc.nextInt();
        }
        Arrays.sort(mark, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] student = new int[M];
        for(int i = 0; i < M; i++){
            student[i] = sc.nextInt();
        }
        for(int i = 0; i < N - 1; i++){
            if(mark[i][1] > mark[i+1][1]) mark[i + 1][1] = mark[i][1];
        }
        for(int i = 0; i < M; i++) {
            int index = Arrays.binarySearch(mark, new int[]{student[i], 0}, (int[] o1, int[] o2) -> {
                        return o1[0] - o2[0];
                    }
            );
            index = index < 0? -(index + 1) - 1 : index;
            System.out.println(index >= 0? mark[index][1]: 0);
        }
//        Map<Integer, Integer> map = new HashMap<>();
        /*for(int i = 0; i < N; i++) {
                map.put(sc.nextInt(), sc.nextInt());
        }
        List<Map.Entry<Integer, Integer>> list= new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int[] student = new int[M];
        int[] result = new int[M];
        for(int i = 0; i < M; i++) {
            student[i] = sc.nextInt();
            int max = 0;
            for(Map.Entry<Integer, Integer> entry : list) {
                 if(student[i] >= entry.getKey() && entry.getValue() > max) max = entry.getValue();
                 result[i] = max;
                 if(max != 0) break;
            }
        }
        for(int a: result) {
            System.out.println(a);
        }*/
    }
}
