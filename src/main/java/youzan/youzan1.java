package youzan;

import java.util.Scanner;

public class youzan1 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                String a = in.next();
                String b = in.next();
                int count = 0;
                int lengtha = a.length();
                int lengthb = b.length();
                if( lengthb > lengtha || lengtha == 0 || lengthb == 0){
                    continue;
                }
                for(int i = 0; i <= lengtha - lengthb; i++) {
                    String s = a.substring(i, i+lengthb);
                    if(s.equals(b)){
                        count++;
                    }
                }
                System.out.println(count);
            }
    }
}
