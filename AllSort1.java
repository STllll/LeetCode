package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllSort1 {
    public static void main(String[] args){
        int[] num = new int[]{1,2,3};

        List<List<Integer>> out= sort(num);
        System.out.println(out);
    }

    public static List<List<Integer>> sort(int[] num) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int a : num) list.add(a);
        util(result,list,num, 0);
        return result;
    }

    public static void util(List<List<Integer>> result,List<Integer> list,int[] num, int i) {
        if(i == num.length ) {
            result.add(new ArrayList<>(list));
        }
        for(int j = i; j < num.length; j++){
               Collections.swap(list,i,j);
                util(result, list, num, i+1 );
            Collections.swap(list,i,j);

        }
    }


}
