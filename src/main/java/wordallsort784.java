import java.util.ArrayList;
import java.util.List;

public class wordallsort784 {
    public static void main(String[] args) {
        String s = "C";
        wordallsort784 w = new wordallsort784();
        List<String> result = w.letterCasePermutation(s);
        for(String st : result) System.out.println(st);
    }
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        result.add(S);
        char[] chr = S.toCharArray();
          allsort(result, 0, S, S.length(), chr);
        return result;
    }

    public void allsort(List<String> result, int i, String s, int len, char[] chr) {
        if(i == len) {
            if(!result.contains(new String(chr))) result.add(new String(chr));
        }
        else {
                if(chr[i] >= 'a' && chr[i] <= 'z'){
                    allsort(result, i + 1, s, len, chr);
                    chr[i] = Character.toUpperCase(chr[i]);
                    allsort(result, i + 1, s, len, chr);
                    chr[i] = Character.toLowerCase(chr[i]);
                }
                else if(chr[i] >= 'A' && chr[i] <= 'Z') {
                    allsort(result, i + 1, s, len, chr);
                    chr[i] = Character.toLowerCase(chr[i]);
                    allsort(result, i + 1, s, len, chr);
                    chr[i] = Character.toUpperCase(chr[i]);
                }
                else allsort(result, i + 1, s, len, chr);
        }
    }
}
