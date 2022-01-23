//0122
//96 Unique Binary Search Trees II

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

//1 <= n <= 8
public class UniqueBST2 {
    public List<TreeNode> generateTrees(int n) {
        //root could be 1... n, every root: different subtrees
        return helperGenerate(1, n);
    }

    private List<TreeNode> helperGenerate(int start, int end) {
        //start from 1, end at n
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        //i: root
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSub = helperGenerate(start, i - 1); //all possible left subtrees
            List<TreeNode> rightSub = helperGenerate(i + 1, end); //all possible right subtrees
            //connect left and right subtrees to root
            for (TreeNode leftNode : leftSub) {
                for (TreeNode rightNode : rightSub) {
                    TreeNode curTree = new TreeNode(i); //set i as root
                    curTree.left = leftNode;
                    curTree.right = rightNode;
                    allTrees.add(curTree);
                }
            }
        }
        return allTrees;
    }
}