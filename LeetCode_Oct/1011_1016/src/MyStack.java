//1013
//225 Implement Stack using Queues
import java.util.*;

class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
//    private int top;

    public MyStack() {

    }

    //Pushes element x to the top of the stack.
    public void push(int x) {
//        q1.add(x);
//        top = x;
        q2.offer(x);
        while (!q1.isEmpty()) q2.offer(q1.poll());
        Queue<Integer> tmp = new LinkedList<>();
        tmp = q1;
        q1 = q2;
        q2 = tmp;
    }

    //Removes the element on the top of the stack and returns it.
    public int pop() {
//        while (q1.size() > 1) {
//            top = q1.remove();
//            q2.add(top);
//        }
        return q1.poll();
    }

    //Returns the element on the top of the stack.
    public int top() {
//        while (q1.size() > 1) {
//            top = q1.remove();
//            q2.add(top);
//        }
        return q1.peek();
//        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
