//21 Merge Two Sorted Lists
//1128
//-100 <= Node.val <= 100

public class Merge2SortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dum = new ListNode(-101);
        ListNode ans = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dum.next = l1;
                dum = dum.next;
                l1 = l1.next;
            }
            else {
                dum.next = l2;
                dum = dum.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) dum.next = l2;
        if (l2 == null) dum.next = l1;
        return ans.next;
    }
}
