public class isSubsequence392 {
    public static void main(String[] args){
           String s = "abc";
           String t = "ahbdgc";
           System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
                  if(s.equals("") && t.equals("")) return  true;
                  if(!s.equals("") && t.equals("")) return false;
                if(s.equals("") && !t.equals("")) return true;
                if(s.length() == t.length() && !s.equals(t)) return false;
                  int i = 0;
                  int j = 0;
                  while(i != t.length() ) {
                      if(j == s.length() ) return true;
                      if(t.charAt(i) == s.charAt(j))
                          j++;
                      i++;
                  }
                  return false;
    }

}
