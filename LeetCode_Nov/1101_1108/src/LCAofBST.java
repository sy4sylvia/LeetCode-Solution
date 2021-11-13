//1104
//235 Lowest Common Ancestor of a Binary Search Tree

import java.util.LinkedList;
import java.util.Queue;

public class LCAofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //DFS
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }


//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (p.left == q || p.right == q) return p;
//        if (q.left == p || q.right == p) return q;
//
//        if (root == null) ;
//        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
//        treeNodeQueue.add(root);
//
//        while (!treeNodeQueue.isEmpty()) {
//            int qSize = treeNodeQueue.size();
//            int level = 0;
//            for (int i = 0; i < qSize; i++) {
//                if (treeNodeQueue.peek().left != null) {
//                    treeNodeQueue.add(treeNodeQueue.peek().left);
//                }
//                if (treeNodeQueue.peek().right != null) {
//                    treeNodeQueue.add(treeNodeQueue.peek().right);
//                }
//                treeNodeQueue.poll();
//            }
//            level++;
//        }
//        return root;
//    }
}
