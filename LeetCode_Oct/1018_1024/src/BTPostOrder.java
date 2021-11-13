//1025
//145 Binary Search Tree PostOrder Traversal
//postorder: left, right, root;

import java.util.ArrayList;
import java.util.List;

public class BTPostOrder {
    final List<Integer> l = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return l;
        postorderTraversal(root.left) ;
        postorderTraversal(root.right);
        l.add(root.val);
        return l;
    }
}
