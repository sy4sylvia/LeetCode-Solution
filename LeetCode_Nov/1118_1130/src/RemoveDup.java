//1127
//83 Remove Duplicates from Sorted List
//-100 <= Node.val <= 100
public class RemoveDup {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-101, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            int val = pre.val;
            if (cur.val == val) pre.next = cur.next;
            else pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
