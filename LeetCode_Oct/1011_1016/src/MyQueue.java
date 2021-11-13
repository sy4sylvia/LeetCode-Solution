//1012
//232 Implement Queue using Stacks

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

class MyQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }

    //Pushes element x to the back of the queue
    public void push(int x) {
        s1.push(x);
    }

    //Removes the element from the front of the queue and returns it.
    public int pop() {
        //retrieve the last ele of s1 and push into s2;
        if (s2.isEmpty()) {
            while (!s1.isEmpty())  s2.push(s1.pop());
        }
        return s2.pop();
    }

    //Returns the element at the front of the queue.
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
