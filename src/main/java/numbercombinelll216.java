import java.util.*;

public class numbercombinelll216 {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k, n, new ArrayList<Integer>(), 1);
        return result;
    }

    public void helper(int k, int n, List<Integer> list, int i) {
        if(list.size() == k && n == 0) {
            result.add(new ArrayList<Integer>(list));
        }
        else {
            for(int j = i; j <= 9; j++) {
                list.add(j);
                int temp = n - j;
                if(temp < 0) {
                    list.remove(list.size() - 1);
                    break;
                }
                helper(k, temp, list, j + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
