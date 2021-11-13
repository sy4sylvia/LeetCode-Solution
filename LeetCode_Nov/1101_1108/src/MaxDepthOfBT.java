//1104
//104 Maximum Depth of Binary Tree

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBT {

    //DFS
//    int maxLevel = Integer.MIN_VALUE;
//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        else {
//            helper(root, 0);
//            return maxLevel + 1;
//        }
//    }
//    private void helper(TreeNode root, int level) {
//        if (root.left != null) helper(root.left, level + 1);
//        if (root.right != null) helper(root.right, level + 1);
//        if (root.left == null && root.right == null) {
//            if (maxLevel < level) maxLevel = level;
//        }
//    }

    //BFS

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int depth = 0;
            while (!q.isEmpty()) {
                int qSize = q.size();
                for (int i = 0; i < qSize; i++){
                    if (q.peek().left != null) q.offer(q.peek().left);
                    if (q.peek().right != null) q.offer(q.peek().right);
                    q.poll();
                }
                depth++;
            }
            return depth;
        }
    }
}
