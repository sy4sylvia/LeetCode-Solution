////1106
////2 Add Two Numbers
//
//public class Add2Nums {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode virtualHead = new ListNode();
//        while (l1.next != null && l2.next != null) {
//            ListNode sum = new ListNode();
//            virtualHead.next = sum;
//            int carry = 0;
//            if (l1.val + l2.val < 10) sum.val = l1.val + l2.val;
//            else {
//                sum.val = (l1.val + l2.val) % 10;
//                carry++;
//            }
//            l1 = l1.next;
//            l2 = l2.next;
//            virtualHead = sum;
//        }
//        if (l1.next == null && l2.next != null) {
//
//        }
//        if (l2.next == null && l1.next != null) {
//
//        }
//        return virtualHead.next;
//    }
//}
