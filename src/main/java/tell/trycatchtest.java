package tell;

public class trycatchtest {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(n);
        String c = help(n, "abc");
        System.out.println(c);
    }

    public static String help(int n, String s ) {
        try {
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return s;
        }
        finally {
            s = "cbd";
        }
    }
}
