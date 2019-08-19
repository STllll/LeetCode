package swordToOffer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class topkinbinarytree {
    public static void main(String[] args) {
        topkinbinarytree top = new topkinbinarytree();
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(10);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(11);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        TreeNode result = top.KthNode(t1, 10);
        System.out.println(result.val);
    }
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        //中序遍历+大根堆
        PriorityQueue<TreeNode> bigheap = new PriorityQueue<>(new Comparator<TreeNode>(){
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return o2.val - o1.val;
            }
        });
        Stack<TreeNode> stack = new Stack<>();
        if(pRoot == null) return null;
        stack.add(pRoot);
       int count = midsort(stack.peek(), stack, bigheap, k, 0);
        if(count < k) return null;
        return bigheap.poll();
    }

    public int midsort(TreeNode pRoot, Stack<TreeNode> stack, PriorityQueue<TreeNode> bigheap, int k, int count){
        if(pRoot.left != null) {
            stack.add(pRoot.left);
            count = midsort(pRoot.left, stack, bigheap, k, count);
        }
        if(bigheap.size() < k){
            bigheap.add(pRoot);
        }
        else if(pRoot.val < bigheap.peek().val) {
            bigheap.poll();
            bigheap.add(pRoot);

        }
        stack.pop();
        count++;
        if(pRoot.right!= null) {
            stack.add(pRoot.right);
            count = midsort(pRoot.right,stack,bigheap,k, count);
        }
        return count;
    }
}