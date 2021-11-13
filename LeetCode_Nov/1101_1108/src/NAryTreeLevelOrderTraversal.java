//1104
//429. N-ary Tree Level Order Traversal

import java.util.*;

public class NAryTreeLevelOrderTraversal {

    //BFS

    List<List<Integer>> l = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {

        if (root == null) return Collections.emptyList();

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> subL = new ArrayList<>();
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                if (!q.peek().children.isEmpty()) {
                    for (Node j : q.peek().children) {
                        q.offer(j);
                    }
                }
                subL.add(q.poll().val);
            }
            l.add(subL);
        }
        return l;
    }
}
