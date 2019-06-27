import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchByZ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String result = convert(s, n);
        System.out.println(result);
    }
    public static String convert(String s, int numRows) {
        List<Character> list = new ArrayList<>();
           int n = s.length();
           Character[][] martix = new Character[numRows][n];
           int row = 0;
           int col = 0;
           int count =0;
           boolean rowflag = false; //向右移动
           boolean colflag = true;  //向下移动
           if(numRows ==1)  return s;
           while( count != s.length() ) {
               martix[row][col] = s.charAt(count);
               count++;
               if(row != numRows-1 && colflag && !rowflag) {        //向下存储
                   row++;
               }
               else if(row == numRows-1 ) {          // 转向向右上移动
                      rowflag = !rowflag;
                      colflag = !colflag;
                      row--;
                      col++;
               }
               else if(row > 0 &&row < numRows-1 && rowflag && !colflag){          //向右上移动
                   row--;
                   col++;
               }
               else if( row == 0 && rowflag && !colflag) {
                      rowflag = !rowflag;                            //转向向下移动
                      colflag = !colflag;
                      row++;
               }
           }
           StringBuffer result = new StringBuffer();
           for(int i = 0; i < numRows ; i++) {
               for(int j =0; j < n ; j++) {
                   if (martix[i][j] == null) continue;
                   if(martix[i][j] < 'z' || martix[i][j]> 'a' || martix[i][j] < 'Z' || martix[i][j]> 'A') result.append(martix[i][j]);

               }
           }
          String a = result.toString();
           return a;
    }
}
