package tencent50;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lowestCommonAncestor236 {
    private TreeNode ans;
    public static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public static void main(String[] args){

  }


  public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         this.choose(root, p, q);
         return this.ans;
       /*if(root == null) return null;
      Queue<TreeNode> stack = new LinkedList<>();
      stack.add(root);
      boolean pchange = false;
      boolean qchange = false;
      while(p.val != q.val){
          if(pchange && qchange) {
              pchange = false;
              qchange = false;
              stack.clear();
              stack.add(root);
          }
          if(stack.isEmpty()) return null;
          else root = stack.poll();
          if(root.left != null) {
              if (root.left == p || root.left == q) {
                  if (root.left == p) {
                      p = root;
                      pchange = true;
                  } else{
                      q = root;
                      qchange = true;
                  }
              } else stack.add(root.left);
          }
          if(root.right != null) {
              if (root.right == p || root.right == q) {
                  if (root.right == p){
                      p = root;
                      pchange = true;
                  }
                  else {
                      q = root;
                      qchange = true;
                  }
              } else stack.add(root.right);
          }
      }
      return p;*/
    }
public  boolean choose(TreeNode currentNode, TreeNode p, TreeNode q) {
        if(currentNode == null) return  false;

        int left = this.choose(currentNode.left, p, q)? 1 : 0;
        int right = this.choose(currentNode.right, p, q)? 1 : 0;
        int mid = (currentNode == p || currentNode == q)? 1 : 0;
        if((left + right + mid) >= 2) this.ans = currentNode;

        return (left + right + mid) > 0;

 }
}
