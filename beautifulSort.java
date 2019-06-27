package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class beautifulSort {
    public static void main(String[] args){
           int result = countArrangement(3);
           System.out.println(result);
    }

    public static int countArrangement(int N) {
        List<Integer>  list = new ArrayList<>();
        for(int i =0; i < N ; i++) list.add(i+1);
        List<List<Integer>> lists = new ArrayList<>();
        sort(N,  0, lists, list);
        return lists.size();
    }

    public static void sort(int n, int i, List<List<Integer>> lists, List<Integer>  list ) {
        if(i == n ) lists.add(list);

        for(int j = i; j < n; j ++) {
            if(list.get(j) % (i + 1) == 0 ||  (i + 1) % list.get(j) == 0){
                Collections.swap(list, i, j);
                sort(n,  i+1, lists, list);
                Collections.swap(list, i, j);
            }

        }
    }



}
