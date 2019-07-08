package swordToOffer;

import java.util.ArrayList;

public class maxWindows {
    public static void main(String[] args){
        int[] num = new int[]{2,3,4,2,6,2,5,1}; // 1,2,4,3,2,6,2,4,5
        System.out.println(maxInwindows(num, 3));
    }
    
    public static ArrayList<Integer> maxInwindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int index = size - 1;
        for(int i = 0; i < size; i++) {
            if(num[i] > max ) max = num[i];
        }
        index++;
        list.add(max);
        while(index< num.length ) {
            if(num[index] > max) {
                max = num[index];
                list.add(max);
                index++;
            } else if(num[index] == max){
                list.add(max);
                index++;
            } else {
                max = util(num, index,size);
                list.add(max);
                index++;
            }
        }
        
        return list;
    }
    public static int util(int[] num, int index, int size) {
        int temp = 0;
        for(int i = index - size +1 ; i <= index; i++) {
            if(num[i] > temp ) temp = num[i];
        }
        return temp;
    }
}
