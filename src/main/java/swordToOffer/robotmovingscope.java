package swordToOffer;

public class robotmovingscope {
    public static void main(String[] args){
            System.out.println(movingCount(3,1,1));
    }

    public static int movingCount(int threshold, int rows, int cols){
        int[][] axis = new int[rows][cols];
        int row=0 ,col = 0;
        int result = 0;
        int flag = 0;
        if(rows == 1 && cols == 1 && threshold > 1) return 1;
        util(row,col,axis, flag,threshold);
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                  if(axis[i][j] == 1) result++;
            }
        }
        return result;
    }

    public static void util(int row, int col,int[][] axis,int flag, int threshold) {
             if(row > axis.length - 1 || col > axis[0].length -1|| row < 0 || col < 0 ) {
                 return;
             }
             if(axis[row][col] == 1) return;
             if(canmove(row,col,threshold)) {
                 axis[row][col] = 1;
             } else return;
             if(flag != 4){
                 util(row-1,col,axis,3,threshold); //向上移动
             }
             if(flag != 3){
                 util(row+1,col,axis,4,threshold); //向下移动
             }
             if(flag != 2) {
                 util(row,col+1,axis,1,threshold); //向右移动
             }
             if(flag != 1) {
                 util(row,col-1,axis,2,threshold); //向左移动
             }
    }

    public static boolean  canmove(int row, int col, int threshold) {
        int sum = 0;
        while(row != 0) {
            sum += row % 10;
            row = row / 10;
        }
        while(col != 0 ) {
            sum += col % 10;
            col = col / 10;
        }
        if(sum > threshold) return false;
        else return true;
    }
}
