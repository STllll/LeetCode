import java.util.ArrayList;
import java.util.List;

public class pancakesort {
    public static void main(String[] args){
              int[] number = new int[]{10,5,1,6,3,8,2,4,7,9};
              System.out.println(pancake(number));
    }

    public static List<Integer> pancake(int[] A) {
        int n = A.length;
        List<Integer> list = new ArrayList<>();
        if(issorted(A)) return list;
        while(!issorted(A)) {
            int index = findMax(A,list.size() / 2);
            list.add(index + 1);
            swap(A, index + 1);
            swap(A, n);
            list.add(n--);
        }
        return list;
    }

    public static boolean issorted(int[] num) {
        for(int i = 0; i < num.length - 1; i++) {
            if(num[i] > num[i + 1]) return false;
        }
        return true;
    }

    public static int findMax(int[] num, int size) {
          int index = 0;
          int max = 0;
          for(int i = 0; i < num.length - size; i++) {
              if(num[i] > max ) {
                  max = num[i];
                  index = i;
              }
          }
          return index;
    }

    public static void swap(int[] num, int i) {
              for (int j = 0; j <= i / 2; j++) {
                  int temp = num[i - 1];
                  num[i - 1] = num[j];
                  num[j] = temp;
                  i--;
              }
    }
}
