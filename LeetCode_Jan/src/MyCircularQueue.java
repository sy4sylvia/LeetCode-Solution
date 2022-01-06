//0105
//622. Design Circular Queue

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
    private int[] q; //store elements, fixed length
    private int head; //pointers indicating head and tail
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        this.q = new int[k];
        this.head = 0;
        this.count = 0; //length of q
        this.capacity = k; //size of array
    }

    public boolean enQueue(int value) {
        if (isFull()) return false; //full
        q[(head + count) % capacity] = value;
        count++;
        return true; //return ture if operation is successful
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % capacity;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return q[head];
    }

    public int Rear() {
        if (isEmpty()) return -1;
//        this.tail = (count - 1 - head) % capacity;
        return q[(count - 1 + head) % capacity];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}
