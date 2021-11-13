import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class TryDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(1);  //Inserts the specified element at the front of this deque
        d.offerFirst(2);
        d.offerFirst(3);
        d.offerLast(4);
        d.offerLast(5);
        d.offerLast(6);
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast()); //Returns the tail of this deque, or null if this deque is empty
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d.pop());
        System.out.println(d.peek());
        System.out.println(d.poll());
    }
}
