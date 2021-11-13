//404 Sum of Left Leaves
//1104

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {

    //BFS
//    public int sumOfLeftLeaves(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        int sum = 0;
//        while (!q.isEmpty()) {
//            int qSize = q.size();
//            for (int i = 0; i < qSize ; i++) {
//                if (q.peek().left != null) {
//                    q.offer(q.peek().left);
//                    sum += q.peek().left.val;
//                }
//                if (q.peek().right != null) q.offer(q.peek().right);
//                q.poll();
//            }
//        }
//        return sum;
//    }

    //DFS

    int totalSum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return totalSum;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) totalSum += root.left.val;
            else helper(root.left);
        }
        helper(root.right);
    }
}
