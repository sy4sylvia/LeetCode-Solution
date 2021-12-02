//23 Merge k Sorted Lists
//1128

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i < lists.length - interval; i += 2 * interval) {
                lists[i] = merge2(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];
//        List<ListNode> tmp = new ArrayList<>();
//        if (lists.length == 0) return null;
//        for (int i = 0; i < lists.length; i++) {
//            ListNode dummy = new ListNode(-10001, lists[i]);
//            ListNode pre = dummy;
//            ListNode cur = lists[0];
//
//            while (cur != null) {
//                int val = pre.val;
//            }
//        }

    }

    private ListNode merge2 (ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-10001);
        ListNode ans = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                dummy.next = head1;
                dummy = dummy.next;
                head1 = head1.next;
            }
            else {
                dummy.next = head2;
                dummy = dummy.next;
                head2 = head2.next;
            }
            if (head1 == null) dummy.next = head2;
            if (head2 == null) dummy.next = head1;
        }
        return ans.next;
    }
}
