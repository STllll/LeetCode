import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args){
        PriorityQueue<Integer> pro = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return   o2 - o1;
            }
        });

        int[] num = new int[]{5,2,3,4,1};
        for(int a: num) {
            pro.add(a);
        }

        System.out.println(pro);
    }


}
