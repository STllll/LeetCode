import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class singleNumber {
    public static void main(String[] args){

    }

    public int singlenumberutil(int[] nums) {
        Set<Integer> set = new HashSet<>();
        long sum1=0;
        long sum2 = 0;
        for(int a : nums) {
            if(set.add(a)) {
                sum1 += a;
            }
            sum2 += a;
        }
        return (int)((sum2 -sum1) / 2);
    }
}
