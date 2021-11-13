//1105
//515 Find Largest Value in Each Tree Row


import java.util.*;

public class LargestValInRow {

    //BFS
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> l = new ArrayList<>();
        if (root == null) return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                if (max < q.peek().val) max = q.peek().val;
                q.poll();
            }
            l.add(max);
        }
        return l;
    }


    //DFS?
//    List<Integer> l = new ArrayList<>();
//    public List<Integer> largestValues(TreeNode root) {
//
//
//    }
//
//    private void helper(TreeNode root, int level) {
//        if (l.size() == level) l.add(root.val);
//
//        if (root.left != null) {
//            helper(root.left, level + 1);
//        }
//
//        if (root.right != null) {
//            helper(root.right, level + 1);
//        }
//    }
}
