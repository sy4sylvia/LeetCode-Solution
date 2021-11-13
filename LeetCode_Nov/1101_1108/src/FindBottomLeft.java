//1107
//513 Find Bottom Left Tree Value

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeft {

    //BFS

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return 0;
        int result = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                result = q.peek().val;
                if (q.peek().right != null) q.offer(q.peek().right);
                if (q.peek().left != null) q.offer(q.peek().left);
                q.poll();
            }
        }
        return result;
    }
}
