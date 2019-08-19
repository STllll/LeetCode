package swordToOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class stringsort {
    public static void main(String[] args) {
        stringsort str = new stringsort();
        ArrayList<String> result = str.Permutation("abc");
        for(String a : result) System.out.println(a);
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        char[] chr = str.toCharArray();
            util(chr, 0, result);
        return result;
    }

    public void util(char[] chr, int i, ArrayList<String> result) {
        if( i == chr.length - 1) {
            if(!result.contains(new String(chr)) )result.add(new String(chr));
        }
        else {
            for(int j = i; j < chr.length  ; j++) {
                swap(chr, i, j);
                util(chr, i+1, result);
                swap(chr, j, i);
            }
        }

    }
    public void swap(char[] chr, int i, int j) {
        char temp = chr[i];
        chr[i] = chr[j];
        chr[j] = temp;
    }
}
