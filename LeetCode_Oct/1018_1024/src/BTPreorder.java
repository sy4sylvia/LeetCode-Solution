//1025
//144 Binary Tree Preorder Traversal
//preorder: root, left, right

import java.util.ArrayList;
import java.util.List;

public class BTPreorder {
    final List<Integer> l = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return l; //base case: root == null, do nothing
        l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return l;
    }
}
