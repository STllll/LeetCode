import java.util.HashMap;
import java.util.Map;

public class sameonezerostring {
    private static int n = 100;
    public static void main(String[] args) {
        String s = "111000110";
        sameonezerostring same = new sameonezerostring();
        System.out.println(same.n);
        same.setN(200);
        System.out.println(n);
        System.out.println(helper(s));
    }
    public static int helper(String s) {
        int count = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') count++;
            else count--;
            if(!map.containsKey(count)) {
                map.put(count, i);
            }
            else {
                int temp = i - map.get(count);
                if (temp > max) max = temp;
            }
        }
        return max;
    }

    public static int helper(){
        return 0;
    }
    public void setN(int n ) {
        this.n = n;
    }
}
