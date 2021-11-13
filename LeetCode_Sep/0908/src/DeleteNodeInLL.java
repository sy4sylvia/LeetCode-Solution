//237

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class DeleteNodeInLL {
    public void deleteNode(ListNode node) {
        ListNode first = new ListNode(-1);
        ListNode temp = first;
        while(node != null) {
            temp.next = node.next;
            node = node.next;
        }
    }

    public static void main(String[] args) {
    }

}
