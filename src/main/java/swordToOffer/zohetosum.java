package swordToOffer;

import java.util.ArrayList;
import java.util.Collections;

public class zohetosum {
    public static void main(String[] args) {
        zohetosum zu = new zohetosum();
        ArrayList<ArrayList<Integer>> result = zu.FindContinuousSequence(10);
        for(ArrayList<Integer> a : result) System.out.println(a);
    }
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
        for(int i =  1; i < (sum +1)/2; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(findzuhe(list, sum, i)){
                Collections.sort(list);
                result.add(new ArrayList<>(list));
            }

        }
        return result;
    }

    public boolean findzuhe(ArrayList<Integer> list, int sum, int k) {
        if(sum == 0) return true;
        else if(sum < 0) return false;
        if(findzuhe(list, sum - k, k + 1)) {
            list.add(k);
            return true;
        } else return false;
    }
}
