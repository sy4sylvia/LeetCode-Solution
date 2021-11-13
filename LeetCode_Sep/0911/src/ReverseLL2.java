// 0913 92 Reverse Linked List II

import java.util.List;

public class ReverseLL2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return reverseListInt(head, left, right);
    }
    private ListNode reverseListInt(ListNode current, int l, int r) {
        ListNode previous = null;
        ListNode leftBorder, rightBorder;

        int count = 0;
        while (current.next != null) {
            while(count < (l - 1)) {
                current = current.next;
                count++;
            }
            rightBorder = current;
            leftBorder = current;


            while (count >= (l - 1) && count < r) {
                ListNode currnext = current.next;
                current.next = previous;
                previous = current;
                current = currnext;
                count++;

            }
            rightBorder.next = current;
            leftBorder.next = previous;
//            current = leftBorder;

            while(current.next != null && count >= r) {
                current = current.next;
                count++;
            }
        }
        return previous;
    }

    public static void main(String[] args) {
        ReverseLL2 rll2 = new ReverseLL2();
        ListNode a = new ListNode(22);
        ListNode b = new ListNode(33);
        ListNode c = new ListNode(88);
        ListNode d = new ListNode(99);
        ListNode e = new ListNode(54);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode rllresult = rll2.reverseBetween(a, 2, 4);
        ListNode currentNew = rllresult;
        while (currentNew != null) {
            System.out.println(currentNew.val);
            currentNew = currentNew.next;
        }
    }
}
