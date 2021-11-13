//1103
//102

//BFS

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BT102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if (root == null) return l;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int qSize = q.size();
            for (int s = 0; s < qSize; s++) {
                subList.add(q.peek().val);
                if (q.peek().left != null) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                q.poll();
            }
            level++;
            l.add(subList);
        }
        return l;
    }
}
