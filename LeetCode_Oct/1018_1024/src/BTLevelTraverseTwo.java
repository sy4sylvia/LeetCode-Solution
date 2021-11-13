//1029
//107 Binary Tree Level Order Traversal II

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTLevelTraverseTwo {
    List<List<Integer>> l = new ArrayList<>();

    private void helper (TreeNode root, int level) {
        if (l.size() == level) {
            l.add(new ArrayList<>());
        }
        List<Integer> subList = l.get(level);
        subList.add(root.val);

        if (root.left != null) helper(root.left, level + 1);
        if (root.right != null) helper(root.right, level + 1);

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return l;
        helper(root, 0);
        Collections.reverse(l);
        return l;
    }
}
