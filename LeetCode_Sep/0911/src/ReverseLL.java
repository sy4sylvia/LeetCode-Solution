import java.util.List;
//206

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        return reverseListInt(head);
    }

    private ListNode reverseListInt(ListNode current) {
        if (current == null) {
            return null;
        } else {
            ListNode previous = null;

            while (current != null) {
                ListNode currnext = current.next;
                current.next = previous;
                previous = current;
                current = currnext;
            }
//            return reverseListInt(previous);  // iteration inside recursion...wrong
            return previous;
        }
    }
    public static void main(String[] args) {
        ReverseLL rll = new ReverseLL();
        ListNode a = new ListNode(22);
        ListNode b = new ListNode(33);
        ListNode c = new ListNode(88);
        ListNode d = new ListNode(99);
        a.next = b;
        b.next = c;
        c.next = d;

        ListNode rllresult = rll.reverseList(a);
        ListNode currentnew = rllresult;
//        if(rllresult == null) {
//            System.out.println(rllresult.val);
//        }
        while (currentnew != null) {
            System.out.println(currentnew.val);
            currentnew = currentnew.next;
        }
    }
}
