//106 Construct Binary Tree from Inorder and Postorder Traversal
//1108

public class ConstructBT {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helperBuilder(inorder,0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode helperBuilder(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight) {
        if (inRight - inLeft < 1) return null;
        if (inRight - inLeft == 1) return new TreeNode(inorder[inLeft]);

        int rootVal = postorder[postRight - 1]; //root is always the rightmost in the array
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        //find root in the inorder
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        //left sub includes root
        root.left = helperBuilder(inorder, inLeft, rootIndex, postorder, postLeft, postLeft + (rootIndex - inLeft));
        root.right = helperBuilder(inorder, rootIndex + 1, inRight, postorder, postLeft + (rootIndex - inLeft), postRight - 1);
        return root;
    }
}
