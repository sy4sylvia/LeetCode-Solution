//1105
//116 Populating Next Right Pointers in Each Node

import java.util.LinkedList;
import java.util.Queue;

public class Populating {
    //BFS
    //reconstructing the tree
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int qSize = q.size();

            for (int i = 0; i < qSize; i++) {
                Node newNode = q.poll();
                if (i < qSize - 1) newNode.next = q.peek();
                if (newNode.left != null) q.offer(newNode.left);
                if (newNode.right != null) q.offer(newNode.right);
            }
        }
        return root;
    }
}
