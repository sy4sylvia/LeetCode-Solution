//1105
//222 Count Complete Tree Nodes

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {
    //BFS
//    public int countNodes(TreeNode root) {
//        int count = 0;
//        if (root == null) return count;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//
//        while (!q.isEmpty()) {
//            int size = q.size();
//            count += q.size();
//            for (int i = 0; i < size; i++) {
//                if (q.peek().left != null) q.offer(q.peek().left);
//                if (q.peek().right != null) q.offer(q.peek().right);
//                q.poll();
//            }
//        }
//        return count;
//    }

    //DFS

    int count = 0;
    public int countNodes(TreeNode root) {
        if (root == null) return count;
        else {
            count++;
            helper(root, 0);
            return count;
        }
    }

    private void helper(TreeNode root, int level) {
        if (root.left != null) {
            helper(root.left, level + 1);
            count++;
        }
        if (root.right != null) {
            helper(root.right, level + 1);
            count++;
        }
    }

//    private void helperRight(TreeNode root, int level) {
//        if (root.right != null) helperRight(root.right, level + 1);
//        if (root.right == null) rightLevel = level;
//    }
}
