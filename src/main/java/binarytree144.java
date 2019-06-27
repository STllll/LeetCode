import javax.swing.tree.TreeNode;
import java.util.*;

/*
* 前序遍历
* */
public class binarytree144 {
    public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> stack = new LinkedList<>();
        if(root != null) {
            stack.add(root);
            while(!stack.isEmpty()) {
                TreeNode node =  stack.poll();
                result.add(node.val);
                if(node.left != null) stack.add(node.left);
                if (node.right != null) stack.add(node.right);
            }
        }
        return result;
    }
}
