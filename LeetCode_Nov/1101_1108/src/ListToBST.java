//109 Convert Sorted List to Binary Search Tree
//1117

import java.util.ArrayList;

public class ListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        int[] nums = sortedArr(head);
        return helperConvert(nums, 0, nums.length);
    }

    private int[] sortedArr(ListNode head) {
        ArrayList<Integer> al = new ArrayList();
        al.add(head.val);
        while (head.next != null) {
            head = head.next;
            al.add(head.val);
        }
        int[] sortedArr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) sortedArr[i] = al.get(i);
        return sortedArr;
    }

    private TreeNode helperConvert(int[] nums, int left, int right) {
        if (left == right) return null;
        if (right - left == 1) return new TreeNode(nums[left]);

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helperConvert(nums, left, mid);
        root.right = helperConvert(nums, mid + 1, right);
        return root;
    }
}
