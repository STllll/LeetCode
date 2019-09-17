package pinduoduo2;

import java.util.*;

public class pinduoduo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String M = sc.next();
            String N = sc.next();
            StringBuffer buffer = new StringBuffer();
            StringBuffer buffer2 = new StringBuffer();
            ArrayList<String> list = new ArrayList<>();
            char[] chr = N.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : chr) {
                if(map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                }
                else map.put(c, 0);
            }
            int count = 0;
            for(int t = 0; t < M.length(); t++) {
                if(map.containsKey(M.charAt(t))) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.println("{");
                System.out.print("}");
            }
                else {
                getresult(M, N, 0, buffer, list,map,buffer2);
                Collections.sort(list);
                System.out.println("{");

                for(int z = 0; z < list.size();z++) {
                    String reuslt1 = list.get(z);
                    for(int g = 0; g < reuslt1.length() - 1; g++) {
                        System.out.print(reuslt1.charAt(g) + " ");
                    }
                    System.out.println(reuslt1.charAt(reuslt1.length() -1));
                }
                System.out.println("}");
            }

        }
    }
   public static boolean isSonString(String string, String M) {
        for(int i = 0; i <= string.length() - M.length(); i++) {
            if(string.charAt(i) != M.charAt(0)) continue;
            String s = string.substring(i, i + M.length());
            if(s.equals(M)) return true;
        }
        return false;
   }

   public static void getresult(String M, String N, int i ,StringBuffer buffer, ArrayList<String> list, HashMap<Character, Integer> map,StringBuffer buffer2) {
                  if( N.equals(buffer2.toString()) ) {
                      while(i < N.length()) {
                          buffer.append("d");
                          i++;
                      }
                      if(!list.contains(buffer.toString()))
                      list.add(buffer.toString());
                      return;
                  }
                  if(i == M.length()) return;
                  if (!map.containsKey(M.charAt(i))) {
                      buffer.append("d");
                      getresult(M,N,i + 1,buffer,list,map,buffer2);
                      buffer.deleteCharAt(buffer.length() - 1);
                  }
                  buffer2.append(M.charAt(i));
                  if(!isSonString(N, buffer2.toString())) {
                      buffer.append("d");
                      buffer2.deleteCharAt(buffer2.length() - 1);
                      getresult(M,N,i + 1,buffer,list,map,buffer2);
                      buffer.deleteCharAt(buffer.length() - 1);
                  } else {
                      buffer.append("r");
                      getresult(M,N,i + 1,buffer, list,map, buffer2);
                      buffer2.deleteCharAt(buffer2.length() - 1);
                      buffer.deleteCharAt(buffer.length() - 1);
                  }
                  buffer2.reverse().append(M.charAt(i)).reverse();
            if(!isSonString(N, buffer2.toString())) {
           buffer.append("d");
           buffer2.reverse().deleteCharAt(buffer2.length() - 1).reverse();
           getresult(M,N,i + 1,buffer,list,map,buffer2);
           buffer.deleteCharAt(buffer.length() - 1);
       } else {
           buffer.append("l");
           getresult(M,N,i + 1,buffer, list,map, buffer2);
           buffer2.reverse().deleteCharAt(buffer2.length() - 1).reverse();
           buffer.deleteCharAt(buffer.length() - 1);
       }

   }
}
