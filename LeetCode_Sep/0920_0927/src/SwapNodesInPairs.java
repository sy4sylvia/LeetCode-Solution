//0920 24

//public class SwapNodesInPairs {
//    public ListNode swapPairs(ListNode head) {
//
//    }
//}


//recursive approach
// * }
//         */
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//
//        // If the list has no node or has only one node left.
//        if ((head == null) || (head.next == null)) {
//            return head;
//        }
//
//        // Nodes to be swapped
//        ListNode firstNode = head;
//        ListNode secondNode = head.next;
//
//        // Swapping
//        firstNode.next  = swapPairs(secondNode.next);
//        secondNode.next = firstNode;
//
//        // Now the head is the second node
//        return secondNode;
//    }
//}


// iterative approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//
//        // Dummy node acts as the prevNode for the head node
//        // of the list and hence stores pointer to the head node.
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//
//        ListNode prevNode = dummy;
//
//        while ((head != null) && (head.next != null)) {
//
//            // Nodes to be swapped
//            ListNode firstNode = head;
//            ListNode secondNode = head.next;
//
//            // Swapping
//            prevNode.next = secondNode;
//            firstNode.next = secondNode.next;
//            secondNode.next = firstNode;
//
//            // Reinitializing the head and prevNode for next swap
//            prevNode = firstNode;
//            head = firstNode.next; // jump
//        }
//
//        // Return the new head node.
//        return dummy.next;
//    }
//}