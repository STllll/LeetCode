package toutiao;

import java.util.Scanner;
/*a
* 思路:感觉没有特殊算法，按照题目要求实现即可。
* 遍历字符串，设置一个count变量用于检测连续三个的情况
* 判断完情况1后判断情况2
* 每次修改后要回到新的起点
*
*
* */
public class repairString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            String s = sc.next();
            String result = util(s);
            System.out.println(result);
        }
    }

    public static String util(String string){
           StringBuffer s = new StringBuffer(string);
           for(int i = 0; i < s.length(); i++) {
               while(i < s.length()-2 && s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)) {
                   s.deleteCharAt(i);
               }
               if( i < s.length()-3 && (s.charAt(i)==s.charAt(i+1) && s.charAt(i+2)==s.charAt(i+3) )){
                   s.deleteCharAt(i+3);
                   i = i-1;
               }
           }
           return s.toString();
    }

}
