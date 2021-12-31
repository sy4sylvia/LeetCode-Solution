//1226
//143 Reorder List


//1 <= Node.val <= 1000
public class ReorderList {
    public void reorderList(ListNode head) {
        //find mid of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow is the midpoint and fast is the last node of the ll

        ListNode prev = null, cur = slow;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }

        //then merge first half and the reversed second half

        ListNode first = head, second = prev, tmp;
        while (second.next != null) {
            tmp= first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }


    private ListNode helperReverse(ListNode cur) {
        if (cur == null) return null;
        else {
            ListNode prev = null;
            while (cur != null) {
                ListNode curNext = cur.next;
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return prev;
        }
    }
}
