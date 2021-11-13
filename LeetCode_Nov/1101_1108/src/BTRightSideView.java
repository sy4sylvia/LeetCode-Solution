//1102
//199 Binary Tree Right Side View

import java.util.ArrayList;
import java.util.List;

public class BTRightSideView {
    //recursive call;
    //rightmost child, append to the list
    final List<Integer> l = new ArrayList<>();

    private void helper(TreeNode root, int level) {
        if (l.size() == level) {
            l.add(root.val);
        }
        if (root.right != null) helper(root.right, level + 1);
        if (root.left != null) helper(root.left, level + 1);

//        else {
//            if (root.left != null) helper(root.left, level + 1);
//        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return l;
        helper(root, 0);
        return l;
    }
}
