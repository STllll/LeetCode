package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class nQueen {
    public static void main(String[] args){

    }

    public List<List<String>> solveNQueens(int n) {
            int[][] chessport = new int[n][n];
            List<List<String>>  result = new ArrayList<>();
            List<int[][]> tem = new ArrayList<>();
        for(int[][] a : tem) {
            for(int i = 0; i < n ; i++) {
                StringBuffer stringBuffer = new StringBuffer();
                    for(int j = 0; j < n; j++) {
                           if(a[i][j] == 0)  stringBuffer.append(".");
                           else if(a[i][j] == 1) stringBuffer.append("Q");
                    }
                    stringBuffer.toString();
                }

            }
return result;
    }
}
