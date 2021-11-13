import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//1104
//637 Average of Levels in Binary Tree

public class AveOfLevelsInBT {

    //BFS
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l = new ArrayList<>();
        if (root == null) return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            double sum = 0;
            for (int i = 0; i < qSize; i++) {
                sum += q.peek().val;
                if (q.peek().left != null) q.add(q.peek().left);
                if (q.peek().right != null) q.add(q.peek().right);
                q.poll();
            }
            l.add(sum / qSize);
        }
        return l;
    }

//    //DFS
//    final List<Double> l = new ArrayList<>();
//    int count = 0;
//    double sum = 0;
//
//    private void helper(TreeNode root, int level) {
//        if (l.size() == level) {
////            if (root != null) {
////                count++;
////                sum += root.val;
////            }
////            l.add(sum / count);
//        }
//
//        if (root.left != null) {
//            helper(root.right, level + 1);
//        }
//        if (root.right != null) {
//            helper(root.left, level + 1);
//        }
//    }
//
//    public List<Double> averageOfLevels(TreeNode root) {
//        if (root == null) return l;
//        helper(root, 0);
//        return l;
//    }
}
