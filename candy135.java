package LeetCode;

public class candy135 {
    public static void main(String[] args){
       int[] ratings = new int[]{1,3,2,2,1}; //1,2,2 1,0,2 1,3,4,5,2
       int result = candy(ratings);
       System.out.println(result);
    }

    public static int candy(int[] ratings) {
          int n = ratings.length;
          int sum = 0;
          int[] sugar = new int[n];
          for(int i = 0; i < n; i++) sugar[i] = 1;
          for(int i =0; i < n -1; i++) {
              if( ratings[i] < ratings[i+1]) sugar[i+1] =sugar[i] +1;
          }

          for(int j = n-1; j > 0; j--) {
              if(ratings[j] < ratings[j -1] && sugar[j] >= sugar[j-1]) sugar[j-1] = sugar[j] +1;
          }
          for(int i = 0; i < n; i++) {
              sum += sugar[i];
          }
          return sum;

    }
}
