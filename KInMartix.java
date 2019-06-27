package LeetCode;

public class KInMartix {
    public static void main(String[] args){
        int[][] martix = new int[][]{{1,5,9},{10,11,13},{12,13,15}};

        System.out.println(sort(martix,8));
    }

    public static int sort(int[][] martix, int k) {
        int n = martix[0].length;
        int low = martix[0][0],high = martix[n-1][n-1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            int j = martix[0].length -1;
            for(int i = 0; i < n ; i++) {
                while (j >= 0 && martix[i][j] > mid) j--;
                count += j + 1;

            }
            if(count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return low;
    }

}
