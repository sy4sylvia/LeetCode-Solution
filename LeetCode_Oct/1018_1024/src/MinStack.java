//1018/1019
//155 Min Stack

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class MinStack {
    private Deque<Integer> d = new LinkedList<>();
    private Stack<Integer> s = new Stack<Integer>();
    private int min = Integer.MAX_VALUE;

    public MinStack() {
    }

    //pushes the element val onto the stack.
    public void push(int val) {
        if (val <= min) d.offerLast(val);
        else d.offerFirst(val);
        s.push(val);
    }

    //removes the element on the top of the stack.
    public void pop() {
        s.pop();
    }

    // gets the top element of the stack.
    public int top() {
        return s.peek();
    }

    public int getMin() {
        return d.peek();
    }
}
