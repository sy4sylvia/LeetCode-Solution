//82. Remove Duplicates from Sorted List II
//1127

//The number of nodes in the list is in the range [0, 300].
//-100 <= Node.val <= 100


public class RemoveDup2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-101, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                pre.next = cur.next;
            }
            else pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
