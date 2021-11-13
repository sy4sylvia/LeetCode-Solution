//203 answer


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        ListNode first = new ListNode(-1, head);
        ListNode temp = first;
        ListNode currentListNode = head;
        while(currentListNode != null) {
            if(currentListNode.val == val) {
                temp.next = currentListNode.next;
            }
            else {
                temp = currentListNode;
            }
            currentListNode = currentListNode.next;
        }
        return first.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        ListNode first = new ListNode();

        ListNode a = new ListNode(1);
//        first.next = a;
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        System.out.println(list);

        ListNode resultHead = s.removeElements(a, 1);
        ListNode current = a;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}