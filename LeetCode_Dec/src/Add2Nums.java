//1211
//2 Add Two Numbers

public class Add2Nums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            //check whether l1 && l2 are null
            int x = 0, y = 0;
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            int sum = carry + x + y;
            carry = sum / 10;
//            if (sum >= 10) carry++;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (carry > 0) cur.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
