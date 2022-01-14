//0105
//1094. Car Pooling

import java.util.*;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<int[]> wait = new PriorityQueue<>(Comparator.comparingDouble(o -> o[1]));
        for (int[] t : trips) wait.offer(t);

        PriorityQueue<int[]> loaded = new PriorityQueue<>(Comparator.comparingDouble(o -> o[2]));
        loaded.offer(wait.poll());
        capacity -= loaded.peek()[0];
        if (capacity < 0) return false;

        while (!wait.isEmpty()) {
            while (!loaded.isEmpty() && wait.peek()[1] >= loaded.peek()[2]) {
                capacity += loaded.poll()[0];
            }
            loaded.offer(wait.peek());
            capacity -= wait.poll()[0];

            if (capacity < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CarPooling cp = new CarPooling();

        int[][] trip = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        // {{3, 2, 7}, {8, 3, 9}, {3, 7, 9}}
        int c = 11;

        System.out.println(cp.carPooling(trip, c));
    }
}
