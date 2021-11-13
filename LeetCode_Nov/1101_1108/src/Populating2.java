//1105
//117 Populating Next Right Pointers in Each Node II

import java.util.LinkedList;
import java.util.Queue;

public class Populating2 {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                Node n = q.poll();
                if (i < qSize - 1) n.next = q.peek();
                if (n.left != null) q.offer(n.left);
                if (n.right != null) q.offer(n.right);

            }
        }
        return root;
    }
}
