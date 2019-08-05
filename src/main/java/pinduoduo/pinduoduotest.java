package pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class pinduoduotest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        int[] origin = new int[s1.length];
        int[] change = new int[s2.length];
        int count = 0;
        int index = 0;
        int count1 = origin.length;
        int count2 = change.length;
        for(int i = 0; i < s1.length; i++) {
            origin[i] = Integer.valueOf(s1[i]);
            change[i] = Integer.valueOf((s2[i]));
            if(i > 0 && origin[i] < origin[i - 1]) {
                count++;
                index = i;
            }
        }
        //
        if(count > 1) {
            System.out.println("NO");
        } else {
            Arrays.sort(change);
        }

        for(int i = change.length - 1; i >= 0; i--) {
            if(change[i] > origin[index - 1] && index + 1 < change.length && change[i] < origin[index + 1]){
                origin[index] = change[i];
                break;
            }
        }
        for(int j = 0; j < count1 ; j++) {
            if(j  != count1 -1)System.out.print(origin[j] + " ");
            else System.out.print(origin[j]);
        }
    }
}
