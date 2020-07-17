package tell;

public class testchuandi {
    static class number {
        int val;
        public number(int n) {
            this.val = n;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        number n = new number(1);
        System.out.println(n.val);
        helper(n);
        System.out.println(n.val);
    }

    public static void helper(number n) {
        n.setVal(10);
    }
}
