package swordToOffer;

import java.util.Stack;

public class MinNumberInRotateArray {
    public static void main(String[] args){
        int[] array = new int[]{3,1,2};
        System.out.println(minNumberInRotateArray(array));
        Stack<String> stack = new Stack<>();
    }

    public static int minNumberInRotateArray(int[] array) {
           int n = array.length;
           if(n == 0) return 0;
           if(n == 1) return array[0];
           int start = 0;
           int end = n - 1;
           int mid;
           while(start < end) {
               mid = start + (end - start) / 2;
               if(array[mid] > array[end]) {
                   start = mid + 1;
                   if(array[start] < array[mid]) return array[start];
               } else end = mid;

           }
           return array[start];
    }
}
