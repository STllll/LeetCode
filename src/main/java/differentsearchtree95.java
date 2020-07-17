import java.util.ArrayList;
import java.util.List;

public class differentsearchtree95 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return generateTrees(0, n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> all_node = new ArrayList<>();
        if (end < start) {
            all_node.add(null);
            return all_node;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateTrees(start, i -1);
            List<TreeNode> right = generateTrees(i + 1, end);

            for(TreeNode l : left) {
                for(TreeNode r : right) {
                    TreeNode currentNode = new TreeNode(i);
                    currentNode.left = l;
                    currentNode.right = r;
                    all_node.add(currentNode);
                }
            }
        }
        return all_node;
    }


}
