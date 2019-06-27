package LeetCode.LeetCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class charInPhoneNumber {
    public static void main(String[] args){
        List<String> list = letterCombinations("23");
        System.out.println(list);
    }

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0 || digits == null) return new ArrayList<>();

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> list = new ArrayList<>();
        util("", digits, 0, list, map);
        return list;
    }

    public static void util(String s,String digits,int i, List<String> list, Map<Character, String> map ) {
          if(i == digits.length()) {
              list.add(s);
              return;
          }
          String temp = map.get(digits.charAt(i));
          for(int j = 0; j < temp.length() ; j++) {
              util(s + temp.charAt(j), digits, i+1, list, map);
          }
    }
}
