package swordToOffer;

public class rotatewords {
    public static void main(String[] args) {
        rotatewords ro = new rotatewords();
        String  str = "student. a am i";
        System.out.println(ro.ReverseSentence(str));
    }
    public String ReverseSentence(String str) {
        String[] string = str.split(" ");
        StringBuffer buffer = new StringBuffer();
        for(int i = string.length - 1; i >= 0 ; i--){
            if(i == 0) {
                buffer.append(string[i]);
            } else buffer.append(string[i]).append(" ");
        }
        return buffer.toString();
    }
}
