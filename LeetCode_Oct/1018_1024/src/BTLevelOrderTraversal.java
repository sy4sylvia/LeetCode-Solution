//1028
//102 Binary Tree Level Order Traversal

import java.util.ArrayList;
import java.util.List;

public class BTLevelOrderTraversal {

    final List<List<Integer>> l = new ArrayList<List<Integer>>();

    public void helper(TreeNode root, int level) {

        if (l.size() == level) {
            l.add(new ArrayList<>());
        }
        List<Integer> subList = l.get(level);
        subList.add(root.val);

        if (root.left != null) helper(root.left, level + 1);
        if (root.right != null) helper(root.right, level + 1);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return l;
        helper(root, 0);
        return l;
    }


}
