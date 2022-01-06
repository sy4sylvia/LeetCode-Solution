import java.util.HashMap;

public class Construction {
    int[] inorder;
    int[] postorder;
    int postIdx;
    HashMap<Integer, Integer> idxMap = new HashMap<Integer, Integer>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        postIdx = postorder.length - 1;
        // build a hashmap value -> its index
        int idx = 0;
        for (Integer nodeVal : inorder) idxMap.put(nodeVal, idx++);
        return helperInorder(0, inorder.length - 1);
    }

    private TreeNode helperInorder(int leftIn, int rightIn) {
        if (leftIn > rightIn) return null;

        int rootVal = postorder[postIdx];
        TreeNode root = new TreeNode(rootVal);
        // root splits inorder arr into left and right subtrees
        int rootIdx = idxMap.get(rootVal);

        postIdx--;

        root.right = helperInorder(rootIdx + 1, rightIn);
        root.left = helperInorder(leftIn, rootIdx - 1);
        return root;
    }
}
