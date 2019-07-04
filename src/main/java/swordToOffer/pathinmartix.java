package swordToOffer;

public class pathinmartix {
    public static void main(String[] args){
            char[] matrix =new char[]{'a','b','c','e','s','f','c','s','a','d','e','e'};
            System.out.println(hashPath(matrix,3,4,new char[]{'a','b','c','b'}));  //'b','c','c','e','d'  . 'a','b','c','c','e','d'
    }

    public static boolean hashPath(char[] matrix, int rows, int cols, char[] str) {
        char[][] chars = new char[rows][cols];
        int[][] visited = new int[rows][cols];
        int index = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                chars[i][j] = matrix[index++];
            }
        }

        boolean result = false;
        ko:
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(chars[i][j] == str[0]){
                    visited[i][j] = 1;
                    result = util(chars, str, 1, i, j,visited);
                    visited[i][j] = 0;
                }
                if(result)  break ko;
            }
        }
        return result;
    }

    /*
    *
    * */
    public static boolean util(char[][] chars, char[] str, int index,int row, int col, int[][] visited) {
                      boolean result = false;
                      if(index == str.length ) result = true;
                      else {
                          if (row - 1 >= 0 && str[index] == chars[row - 1][col]&& visited[row -1][col ] != 1) {   //向上走
                              visited[row - 1][col] = 1;
                              result = util(chars, str, index + 1, row - 1, col, visited);
                              visited[row - 1][col] = 0;
                          }
                          if (row + 1 <= chars.length - 1 && str[index] == chars[row + 1][col] && !result && visited[row + 1][col ] != 1) { // 向下走
                              visited[row + 1][col] = 1;
                              result = util(chars, str, index + 1, row + 1, col, visited);
                              visited[row + 1][col] = 0;
                          }
                          if(col - 1 >= 0 && str[index] == chars[row][col - 1] && !result && visited[row][col -1] != 1) {   // 往左走
                              visited[row ][col - 1] = 1;
                              result = util(chars, str, index + 1, row + 1, col, visited);
                              visited[row ][col - 1] = 0;
                          }
                          if(col +1  <= chars[0].length - 1 && str[index] == chars[row][col + 1] && !result && visited[row][col + 1] != 1) {   // 往右走
                              visited[row ][col+ 1] = 1;
                              result = util(chars, str, index + 1, row , col + 1, visited );
                              visited[row ][col+ 1] = 0;
                          }
                      }
                      return result;
    }
}
