public class jiemastring394 {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        if(s.equals("")) return "";
        int n = s.length();
        if(n == 0 || n == 1) return s;
        int pre = 0;
        int after = 0;
        int count = 0;
        int time = -1;
        for(int i = 0; i < n; i++) {
            if(time == -1 &&s.charAt(i) > '0' && s.charAt(i) <= '9') {
                time = i;
            }
            if(count == 0 && s.charAt(i) == '[' ) {
                count++;
                pre = i;
                break;
            }
        }
        after = pre + 1;
        while(count != 0) {
            if(s.charAt(after) == '[' ) count++;
            if(s.charAt(after) == ']') count--;
            after++;
        }
        after--;
        if(time == -1 || after == 0) return s;
        else {
            int number = Integer.parseInt(s.substring(time,pre));
            String news = "";
            for(int j =0; j < number;j++) {
                news += s.substring(pre + 1, after);
            }
            return s.substring(0,time)+ decodeString(news) + decodeString(s.substring(after + 1));
        }
    }
}
