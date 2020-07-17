package tell;

import java.math.BigDecimal;
import java.util.Date;

public class tell {
    static  class val {
        int val = 0;

        public val(int a) {
            this.val = a;
        }

        public void setVal(int b) {
            this.val = b;
        }
    }
    public static void main(String[] args) {
        String b = new String("abc");
        String a = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(helper());
    }

    public  static int helper() {
        String b = new String("abcde");
        val v = new val(5);
        try {
            return v.val;
        }catch (Exception e) {
            return v.val;
        } finally {
            v.setVal(12);
            return v.val;
        }
    }

    static  class test1 {
        public  void pint(){
            System.out.println("ceshi");
        }
    }
    public class test2{

    }
}
