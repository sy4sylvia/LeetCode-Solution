//1127
//1836. Remove Duplicates From an Unsorted Linked List
//1 <= Node.val <= 105

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDupUnsorted {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode cur = head;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (cur != null) {
            hm.put(cur.val, hm.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }

        dummy = new ListNode(0, head);
        pre = dummy;
        cur = head;
        while (cur != null) {
            if (hm.get(cur.val) > 1) pre.next = cur.next;
            if (hm.get(cur.val) == 1) pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
