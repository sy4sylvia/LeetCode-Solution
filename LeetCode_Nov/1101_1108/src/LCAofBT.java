//1104
//236 Lowest Common Ancestor of a Binary Tree

import java.util.ArrayList;
import java.util.List;

public class LCAofBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return postOrder(root, p, q);
    }

    private TreeNode postOrder(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode leftTree = postOrder(root.left, p, q);
        TreeNode rightTree = postOrder(root.right, p, q);

        if (leftTree != null && rightTree != null) return root;
        if (leftTree == null) return rightTree;
        else return leftTree; //rightTree == null
    }



//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        List<TreeNode> path = new ArrayList<>();
//        List<List<TreeNode>> l = new ArrayList<>();
//        helperPath(root,path, l);
//        for (int i = 0; i < l.size(); i++) {
//            for (int j = 0; i < l.get(i).size(); j++) {
//                if (l.get(i).get(j) == p)
//            }
//        }
//
//    }
//
//    private void helperPath(TreeNode root, List<TreeNode> path, List<List<TreeNode>> l) {
//        //preorder
//        if (root != null) {
//            path.add(root);
//            if (root.left == null && root.right == null) l.add(new ArrayList<>(path));
//            if (root.left != null) {
//                helperPath(root.left, path, l);
//                path.remove(path.size() - 1);
//            }
//            if (root.right != null) {
//                helperPath(root.right, path, l);
//                path.remove(path.size() - 1);
//            }
//        }
//    }
}
