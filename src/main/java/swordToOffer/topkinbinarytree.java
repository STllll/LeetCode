package swordToOffer;

import java.util.Queue;
import java.util.Stack;

public class topkinbinarytree {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static TreeNode findNode(TreeNode pRoot, int k) {
            if(k == 0) return null;
            int count = 0;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            while (pRoot.left != null) {
                stack.add(pRoot);
                pRoot = pRoot.left;
            }
            count++;
            if(count == k) return pRoot;
            while (count != k) {
                if (stack.peek() != null) {
                    pRoot = stack.pop();
                    count++;
                    if (count != k && pRoot.right != null) count++;
                } else break;
            }
            count++;
            pRoot = pRoot.right;
            while (count != k) {
                if(pRoot.left == null) break;
                count++;
                if (count != k && pRoot.right != null) {
                     count++;
                     pRoot = pRoot.right;
                }
            }
             if(count == k)return pRoot;
             else return null;
        }

}
