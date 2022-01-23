import java.util.*;

public class StackDFS {

    //494 Target Sum
    //nums.length >=1
    int ways = 0;
    public int findTargetSumWays(int[] nums, int target) {
        helpPath(nums, target, 0, 0);
        return ways;
    }
    private void helpPath(int[] nums, int target, int idx, int curSum) {
        if (idx == nums.length) {
            if (target == curSum) ways++;
            return;
        }
        helpPath(nums, target, idx + 1, curSum + nums[idx]);
        helpPath(nums, target, idx + 1, curSum - nums[idx]);
    }

    //133. Clone Graph
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    HashMap<Node, Node> visited = new HashMap<>();
    //key: original nodes, val: new nodes
    public Node cloneGraph(Node node) {
        //un-digraph
        if (node == null) return node;
        if (visited.containsKey(node)) return visited.get(node);

        // Create a clone for the given node, don't have cloned neighbors as of now, hence [].
        Node cur = new Node(node.val, new ArrayList<>());
        visited.put(node, cur);

        // Iterate through the neighbors to generate their clones
        for (Node neighbor: node.neighbors) cur.neighbors.add(cloneGraph(neighbor));
        return cur;
    }



}
