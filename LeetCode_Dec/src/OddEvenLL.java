//1201
//328 Odd Even Linked List

public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null; //0 ListNode
        //mark odd and even separately
        ListNode odd = head;
        ListNode even = head.next;
        ListNode firstEven = head.next;

        if (odd.next == null) return head; //1 ListNode
        if (even.next == null) return head; //2 ListNodes

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
