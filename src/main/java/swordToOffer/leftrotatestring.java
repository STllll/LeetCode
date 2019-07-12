package swordToOffer;

import java.util.List;

public class leftrotatestring {
    public static void main(String[] args){
          System.out.println(rotate("abcXYZdef", 3));
    }

    public static String rotate(String str, int n) {
        String substring = str.substring(n);
        StringBuffer stringBuffer = new StringBuffer(substring);
        stringBuffer.append(str.substring(0,n));
        return stringBuffer.toString();
    }
}
