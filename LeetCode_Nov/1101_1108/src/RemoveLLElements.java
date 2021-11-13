//1112
//203 Remove Linked List Elements


import java.util.List;

public class RemoveLLElements {

    //recursion
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) return null;
//        head.next = removeElements(head.next, val);
//        return (head.val == val) ? head.next : head;
//    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-1, head); //ListNode(int val, ListNode next)
        ListNode previous = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) previous.next = current.next;
            else previous = current;
            current = current.next;
        }
        return dummy.next; //reminder: not previous.next
    }
}
