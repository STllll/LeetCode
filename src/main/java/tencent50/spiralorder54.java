package tencent50;

import java.util.ArrayList;
import java.util.List;

public class spiralorder54 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{};
         List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0 ) return list;
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] flag = new boolean[row][col];
        int index = 0;
        int i = 0;
        int forth = 0; // 0代表向右 1代表向左 2代表向上  3代表向下
        int count = 0;
        while ( count != row * col) {
            if (forth == 0 && index < col && !flag[i][index]  ) {
                list.add(matrix[i][index]);    //向右走
                flag[i][index] = true;
                  index++;
                count++;
                continue;

            } else if (forth == 0 &&(index == col || flag[i][index])) {
                i++;
                index--;//转向向下
                forth = 3;
                continue;

            }
            if (forth == 3 && i < row && !flag[i][index]  ) {
                list.add(matrix[i][index]);  //向下走
                flag[i][index] = true;
                i++;
                count++;
                continue;

            } else if (forth == 3 && (i == row || flag[i][index])) {
                index--;
                i--;
                forth = 1;
                continue;

            }
            if (forth == 1 && index >= 0 && !flag[i][index]  ) {
                list.add(matrix[i][index]);
                flag[i][index] = true;
                index--;
                count++;
                continue;

            } else if(forth == 1 && (index == -1 || flag[i][index])) {
                index++;
                i--;
                forth = 2;
                continue;

            }
            if(forth == 2&& i > 0 && !flag[i][index] ) {
                list.add(matrix[i][index]);
                flag[i][index] = true;
                i--;
                count++;

            } else if(forth == 2 && (flag[i][index])) {
                i++;
                index++;
                forth = 0;

            }
        }
        return list;
    }
}
