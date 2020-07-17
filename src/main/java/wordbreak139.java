import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordbreak139 {
    public static void main(String[] args) {
        String s= "applepenapple";
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(wordBreak(s, list));
    }
    static Set<String> set = new HashSet<>();
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] mark = new boolean[s.length() + 1];
        mark[0] = true;
        for(String a : wordDict) set.add(a);
        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(mark[j] && set.contains(s.substring(j, i))) {
                    mark[i] = true;
                    break;
                }
            }
        }
        return mark[s.length()];
    }
}
