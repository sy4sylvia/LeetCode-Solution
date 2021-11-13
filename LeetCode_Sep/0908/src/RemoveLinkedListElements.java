//203 redo

class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        else {
            ListNode dummy = new ListNode(-1, head);
            ListNode movingNode = dummy;
            ListNode currentNode = head;
            while (currentNode != null) {
                if (currentNode.val == val) {
                    movingNode.next = currentNode.next;
                } else {
                    movingNode = currentNode;
                }
                currentNode = currentNode.next;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {

    }
}