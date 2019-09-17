package swordToOffer;

public class bignumbermultifly {
    public static void main(String[] args) {
        String one = "123412431";
        String two = "4124123123";
        String result = util(one, two);
        System.out.println(result);
    }

    public static String util(String one, String two) {
        int[] result = new int[one.length() + two.length()];
        one = new StringBuffer(one).reverse().toString();
        two = new StringBuffer(two).reverse().toString();
        char[] s1 = one.toCharArray();
        char[] s2 = two.toCharArray();
        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                result[i + j + 1] += (s1[i] - '0') * (s2[j] - '0');
            }
        }
        for (int z = 0; z < result.length - 1; z++) {
            if (result[z] > 10) {
                result[z + 1] += result[z] / 10;
                result[z] = result[z] % 10;
            }
        }
        StringBuffer st = new StringBuffer();
        for(int i = 0; i < result.length; i++){
            st.append(result[i]);
        }
        st.append("0000");
        st.reverse();

        return st.toString().replaceFirst("^(0+)", "");
    }
}
