import java.util.*;
public class LongestNoRepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
           HashSet<Character> set = new HashSet();
            int result = 0;
            int count = 0;
            int index = 0;
            int times = 0;
            for (int i = 0; i < s.length(); i++) {
                if(times == s.length()-1) break;
                if ( !set.add(s.charAt(i) )){
                    if(s.charAt(i) == s.charAt(i-1)) index++;
                    set.clear();
                    if (count > result) result = count;
                    i = index;
                    set.add(s.charAt(i));
                    times ++;
                    count = 1;
                    continue;
                }
                else {
                    set.add(s.charAt(i) );
                    index = i;
                    count++;
                    times = 0;
                    if (count > result) result = count;
                }

            }
            System.out.println(result);
        }
        sc.close();
    }
}


