package swordToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortarraytomin {

    public String PrintMinNumber(int [] numbers) {
        if(numbers == null) return null;
        int length = 0;
        int n = numbers.length;
        if(n == 0) return null;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
                list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = o1 + "" + o2;
                String b = o2 + "" + o1;
                return a.compareTo(b);
            }
        });
        StringBuffer buffer = new StringBuffer();
        for(int a : list) buffer.append(a);
        return buffer.toString();
    }
}
