package pinduoduo;

import java.util.*;

public class pinduoduono1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        int[] origin = new int[s1.length];
        int[] change = new int[s2.length];
        int count1 = s1.length;
        int count2 = s2.length;

        if(count1 == 0 || count2 == 0) {
            System.out.println("NO");
            return;
        }
        int up = -1;
        int target = origin[0];
        int index = 0;
        int changenumber = -1;
        for(int i = 0; i < s1.length; i++) {
            origin[i] = Integer.valueOf(s1[i]);
        }
        for(int j = 0; j < s2.length; j++) {
            change[j] = Integer.valueOf(s2[j]);
        }
        if(count1 == 1) {
            System.out.println(origin[0]);
            return;
        }
        int down = origin[count1 - 1];
        int mark = 0;
        for(int i = 0; i < count1 - 1; i++) {
            if(origin[i] >= origin[i + 1]) {
                target = origin[i + 1];
                index = i + 1;
                down = origin[i];
                if(i != count1 - 2) {
                    up = origin[i + 2];
                }
                mark++;
            }
        }
        int flag = 0;
        if(up == down) {
            up = target;
            index--;
            flag = 1;

        }
        if(mark > 1) {
            System.out.println("NO");
            return;
        }
         // 上面已经找到了要替换的数字 下面就是找最大的数字
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < count2 ; i++) {
            list.add(change[i]);
        }
        Collections.sort(list);
        if(flag == 0) {
            for (int j = count2 - 1; j >= 0; j--) {
                if (list.get(j) > down && up != -1 && list.get(j) < up) {
                    changenumber = list.get(j);
                    break;
                } else if (list.get(j) > down && up == -1) {
                    changenumber = list.get(j);
                    break;
                }
            }
        }
        if(flag == 1) {
            for (int j = count2 - 1; j >= 0; j--) {
                if(list.get(j) < up){
                    changenumber = list.get(j);
                    break;
                }
            }
        }

        if( changenumber == -1) {
            System.out.println("NO");
        } else {
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < count1; i++) {
                result.add(origin[i]);
            }
            result.remove(index);
            result.add(changenumber);
            Collections.sort(result);
            for(int j = 0; j < count1 ; j++) {
                if(j  != count1 -1)System.out.print(result.get(j) + " ");
                else System.out.print(result.get(j));
            }
        }
    }
}
