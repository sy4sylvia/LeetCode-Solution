//0120
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class ReverseLinkedList {
//    206. Reverse Linked List: reverse the whole list
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        //recursive
        ListNode prev = reverseList(head.next);

        head.next.next = head;
        head.next = null; //or there would be a cycle

        return prev;
    }

    //start with reversing the first n nodes

    ListNode successor = null;
    public ListNode reverseFirstN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head; //no reverse when n = 1
        }
        ListNode last = reverseFirstN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    //92. Reverse Linked List II
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //position left, position right
        if (left == 1) { //reverse first n nodes
            return reverseFirstN(head, right);
        }
        head.next = reverseBetween(head, left - 1, right - 1); // Recurse with m and n reduced.
        return head;
    }




}
