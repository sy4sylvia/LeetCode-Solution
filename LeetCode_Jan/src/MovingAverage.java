//0105
//346 Moving Average from Data Stream

import java.util.*;

public class MovingAverage {
    private int count = 0;
    private int size;
    private int windowSum = 0;

    Queue<Integer> data = new LinkedList<>();

    public MovingAverage(int size) {
        this.size = size;
    }


    public double next(int val) {
        ++count;
        data.offer(val);

        if (count < size) {
            int tail = data.poll();
            windowSum += val - tail;
        }
        else windowSum += val;
        return (double) windowSum / count;

    }

    public static void main(String[] args) {
        MovingAverage obj = new MovingAverage(3 );
        double para = obj.next(1);
        double para2 = obj.next(10);
        System.out.println(para2);

    }
}
