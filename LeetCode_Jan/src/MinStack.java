//0117

import java.util.List;
import java.util.Stack;

class MinStack {
    //using LinkedList nodes

    class ListNode {
        int val;
        int min;
        ListNode next;

        ListNode (int val, int min) {
            this.val = val;
            this.min = min;
            next = null;
        }
    }

    private ListNode head;

    public MinStack() {

    }

    public void push(int val) {
        if (head == null) head = new ListNode(val, val);
        else {
            ListNode cur = new ListNode(val, Math.min(val, head.min));
            cur.next = head;
            head = cur;
        }
    }

    public void pop() {
        if (head != null) head = head.next;
    }

    public int top() {
        if (head != null) return head.val;
        return -1;
    }

    public int getMin() {
        if (head != null) return head.min;
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */