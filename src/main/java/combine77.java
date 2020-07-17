import java.util.*;

public class combine77 {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        int[] number = new int[n];
        for(int i = 1; i <= n; i++) {
            number[i - 1] = i;
        }
        helper(1, n, k, new ArrayList<Integer>());
        return result;
    }

    public static void helper(int i, int n, int k, List<Integer> list) {
        if(list.size() == k) {
            result.add(new ArrayList<>(list));
        }
        else {
            for(int j = i; j <= n; j++) {
                list.add(j);
                helper(j +1, n, k, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
