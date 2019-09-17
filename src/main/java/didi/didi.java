package didi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class didi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 2 * n - 1; i++) {
            buffer.append(sc.next()).append(" ");
        }
        String str = buffer.toString();
        String[] s = str.split(" ");
        int[] number = new int[n];
        String[] fuhao = new String[n - 1];
        int i = 0;
        int j = 0;
        for (String a : s) {
            if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) fuhao[j++] = a;
            else number[i++] = Integer.valueOf(a);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int z = 0; z < fuhao.length; z++) {
            if (fuhao[z].equals("+")) {
                int count = z + 1;
                while (count < fuhao.length && fuhao[count].equals(fuhao[z])) count++;
                List<Integer> list = new ArrayList<>();
                for (int g = z; g < count; g++) {
                    list.add(number[g]);
                }
                z = count;
                Collections.sort(list);
                for (int num : list) stringBuffer.append(num).append(" ").append("+").append(" ");
            }else if (fuhao[z].equals("-")) {
                int count = z + 1;
                while (count < fuhao.length && fuhao[count].equals(fuhao[z])) count++;
                List<Integer> list = new ArrayList<>();
                for (int g = z; g < count; g++) {
                    list.add(number[g]);
                }
                z = count;
                Collections.sort(list);
                for (int num : list) stringBuffer.append(num).append(" ").append("-").append(" ");
            } else if (fuhao[z].equals("/")) {
                int count = z + 1;
                while (count < fuhao.length && fuhao[count].equals(fuhao[z])) count++;
                List<Integer> list = new ArrayList<>();
                for (int g = z; g < count; g++) {
                    list.add(number[g]);
                }
                z = count;
                Collections.sort(list);
                for (int num : list) stringBuffer.append(num).append(" ").append("/").append(" ");
            } else if (fuhao[z].equals("*")) {
                int count = z + 1;
                while (count < fuhao.length && fuhao[count].equals(fuhao[z])) count++;
                List<Integer> list = new ArrayList<>();
                for (int g = z; g < count; g++) {
                    list.add(number[g]);
                }
                z = count;
                Collections.sort(list);
                for (int num : list) stringBuffer.append(num).append(" ").append("*").append(" ");
            }
        }
        System.out.println(stringBuffer.toString());

    }
}
