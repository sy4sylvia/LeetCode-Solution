//1211
//445 Add Two Numbers II

import java.util.Stack;

public class Add2Num2 {
    //using Stack
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        Stack<Integer> s1 = new Stack<>();
//        Stack<Integer> s2 = new Stack<>();
//
//        while (l1 != null) {
//            s1.push(l1.val);
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            s2.push(l2.val);
//            l2 = l2.next;
//        }
//        int sum = 0;
//        ListNode dummy = new ListNode(0);
//        while (!s1.isEmpty() || !s2.isEmpty()) {
//            if (!s1.isEmpty()) sum += s1.pop();
//            if (!s2.isEmpty()) sum += s2.pop();
//            dummy.val = sum % 10;
//            ListNode cur = new ListNode(sum / 10);
//            cur.next = dummy;
//            dummy = cur;
//            sum /= 10;
//        }
//        if (dummy.val == 0) return dummy.next;
//        else return dummy;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = helperReverse(l1);
        l2 = helperReverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
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
            carry = sum / 10; // update carry
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (carry == 1) cur.next = new ListNode(carry); // update cur.next
        }
        return helperReverse(dummy.next);
    }

    private ListNode helperReverse(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        node = pre;
        return node;
    }
}
