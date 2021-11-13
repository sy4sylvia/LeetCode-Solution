//0929
//19 Remove Nth Node From End of List

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class RemoveNodeFromBack {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode one = dummy;
        ListNode two = dummy;

        for (int i = 0; i <= n; n++) one = one.next;
        while (one.next != null) {
            one = one.next;
            two = two.next;
        }
        two.next = two.next.next;
        return dummy.next;
    }
}



///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
////     public ListNode removeNthFromEnd(ListNode head, int n) {
//
////     }
//
//    int size;
//    ListNode head;
//
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//
//    }
//
//    public void deleteNth(int n) {
//        int index = size - n;
//        if(index >= size || index < 0) return;
//        size--;
//        ListNode t = head;
//        for(int i = 0; i < index; i++) {
//            t = t.next;
//        }
//        t.next = t.next.next;
//    }
//}