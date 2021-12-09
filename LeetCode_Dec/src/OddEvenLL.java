public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode firstEven = head.next;
        if (even == null || even.next == null) return head;
        while (odd.next != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = firstEven;
        return head;
    }
}
