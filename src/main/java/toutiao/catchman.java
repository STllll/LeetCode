package toutiao;

import java.util.*;

/*
* 思路：题目整体是有条件的全排列
*
* */
public class catchman {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int distance = sc.nextInt();
        int[] range = new int[n];
        for(int i = 0; i < n ; i++) {
             range[i] = sc.nextInt();
        }
        util(distance, range, n);
    }

    public  static  void util(int distance, int[] range, int n) {
        List<List<Integer>> compare = new ArrayList<>();
               for(int i = 0; i < n ; i++) {
                  List<Integer> result = new ArrayList<>();
                  result.add(range[i]);
                   result(compare,distance,range,0,result);
               }
               System.out.println(compare.size()%99997867);
    }

    public static void result( List<List<Integer>> list,int distance, int[] range, int i, List<Integer> result){
         if(result.size() == 3 ) {
             if(!list.contains(result)) {
                 list.add(result);
             }
         }
         else {
             for(int j = i; j < range.length ; j++) {
                 if(range[j] - Collections.min(result) <= distance && Collections.max(result) - range[j] <= distance) {
                     result.add(range[j]);
                 }
//                 swap(range,j,i);
                 result(list,distance,range,i+1,result);
//                 swap(range,j, i);
             }

         }
    }
    public static int min(int[] result) {
        int min = result[0];
         for(int i =0 ; i < result.length; i++) {
             if(result[i] < min) min = result[i];
         }
         return min;
    }
    public static int max(int[] result) {
        int max = result[0];
        for(int i =0 ; i < result.length; i++) {
            if(result[i]> max ) max = result[i];
        }
        return max;
    }

    public static void swap(int[] range, int j, int i) {
        int temp = range[i];
        range[i] = range[j];
        range[j] = temp;
    }
}
