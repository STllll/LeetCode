package swordToOffer;

public class mininarray {
    public static void main(String[] args) {
        int[] num = new int[]{3,1,2};
        System.out.println(minNumberInRotateArray(num));
    }

    public static int minNumberInRotateArray(int [] array) {
        int n = array.length;
        if(n == 0) return 0;
        if( n == 1) return array[0];
        if(array[0] < array[n - 1]) return array[0];
        int down = 0;
        int up = n - 1;
        int mid;
        while(down < up) {
            mid = down + (up - down) / 2;
            if(array[down] > array[down + 1]) return array[down + 1];
            if(array[down] > array[mid]) down = mid + 1;
            else up = mid ;

        }
        return array[down];
    }
}
