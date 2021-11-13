//1016
//716 Max Stack

import java.util.Deque;
import java.util.LinkedList;

class MaxStack {

    private Deque<Integer> d = new LinkedList<>();

    public MaxStack() {

    }

    public void push(int x) {

    }

    public int pop() {
        return d.pop();
    }

    public int top() {
        return d.peek();
    }

    public int peekMax() {
        return d.peek();
    }

    public int popMax() {
        return d.pop();
    }
}
