package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllSortK {
    public static void main(String[] args){
        int[] num = new int[]{1,2,3};

        List<List<Integer>> out= sort(num);
        System.out.println(out);
    }

    public static List<List<Integer>> sort(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        util(result,list,nums, 0);
        for(int a : nums) list.add(a);
        result.add(list);
        return result;
    }

    public static void util(List<List<Integer>> result,List<Integer> list,int[] num, int i) {

        for(int j = i; j < num.length; j++){
                list.add(num[j]);
            if(!result.contains(list) && list.size() != num.length) {
                result.add(new ArrayList<>(list));
            }
            util(result, list, num, j+1 );
                list.remove(list.size() - 1);
        } return;
    }

}
