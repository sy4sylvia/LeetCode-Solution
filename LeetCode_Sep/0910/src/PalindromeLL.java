//234

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        int i = 0;

        ListNode current = head;
        ListNode after = current.next;

        ArrayList<Integer> arr = new ArrayList<>();
        if(after == null) {
            return true;
        }
        else {
            while (after != null) {
                arr.add(current.val);
                current = current.next;
                after = after.next;
                i++;
            }
            arr.add(current.val);

            int left = 0, right = i;
            while(left <= i && right >= 0) {
                if (arr.get(left) != arr.get(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        PalindromeLL pll = new PalindromeLL();
//        ListNode first = new ListNode;

        ListNode a = new ListNode(1);
//        first.next = a;
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);
        ListNode f = new ListNode(1);
        a.next = b;
        b.next = c;
        b.next = d;
        d.next = e;
        e.next = f;

//        List<Integer> list = new LinkedList<>();
//
////        ListNode resultHead = pll.isPalindrome(a);
//        ListNode current = a;
//        while(current != null) {
//            System.out.println(current.val);
//            current = current.next;
//        }
        System.out.println(pll.isPalindrome(a));
    }
}
