package swordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class sequenceofstack {
    public static void main(String[] args){
        int[] in = new int[]{1,2,3,4,5};
        int[] out = new int[]{4,5,3,2,1};
        System.out.println(isSequence(in, out));
    }
    public static Boolean isSequence(int[] in, int[] out) {
        Stack<Integer> stack  = new Stack<>();
        int popnum = 0;
        int pushnum = 0;
        for(;pushnum < in.length; pushnum++) {
            stack.add(in[pushnum]);
            while(!stack.isEmpty() && stack.peek() == out[popnum]) {
                stack.pop();
                popnum++;
            }
        }
        return stack.isEmpty();
    }
}
