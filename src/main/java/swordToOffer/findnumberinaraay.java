package swordToOffer;

public class findnumberinaraay {
    public static void main(String[] args) {
        int[] number = new int[]{3,3,3,3,4,5};
        findnumberinaraay find = new findnumberinaraay();
        int result = find.GetNumberOfK(number, 3);
        System.out.println(result);
    }
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0) return 0;
        int down= erfensortdown(array, 0, array.length - 1, k);
        int up = erfensortup(array, 0, array.length - 1, k);
        int result = up - down;
        if(down == -1 || up == -1) return 0;
        return result + 1;
    }

    public int erfensortdown(int[] array, int down, int up, int target) {

        while(down < up) {
            int mid = (down + up) >> 1;
            if(array[mid] > target){
                up = mid  ;
            } else if(array[mid] < target) {
                down = mid + 1;
            } else if(array[mid] == target){
                if(mid == 0) return 0;
                else if(array[mid - 1] != target) return mid;
                else up = mid - 1;
            }
        }
        if(array[down] != target) return -1;
        return down;
    }

    public int erfensortup(int[] array, int down, int up, int target) {

        while(down < up) {
            int mid = (down + up) >> 1;
            if(array[mid] < target){
                down = mid + 1;
            } else if(array[mid] > target){
                up = mid ;
            } else if(array[mid] == target){
                if(mid == array.length - 1) return array.length - 1;
                else if(array[mid + 1] != target) return mid;
                else down = mid + 1;
            }
        }
        if(array[down] != target) return -1;
        return down;
    }
}
