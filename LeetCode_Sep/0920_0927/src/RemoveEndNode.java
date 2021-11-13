//0922 19 remove Nth node from end of list

public class RemoveEndNode {
    int size;
    ListNode head;

    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int size = 0;
//        head = new ListNode(0);
//        deleteNth(n);
//        return head;
        ListNode cur = head;
        deleteNth(n);
        return cur;
    }

    public void deleteNth(int n) {
        int index = size - n;
        if(index >= size || index < 0) return;
        size--;
        ListNode t = head;
        for(int i = 0; i < index; i++) {
            t = t.next;
        }
        t.next = t.next.next;
    }
}
