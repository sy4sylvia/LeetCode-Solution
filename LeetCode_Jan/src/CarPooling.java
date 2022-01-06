//0105
//1094. Car Pooling

import java.util.*;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {

//        Arrays.sort(trips, Comparator.comparingDouble(o -> o[1]));
        // trips = [[2,1,5],
        //         [3,3,7]]

//        Queue<int[]> wait = new LinkedList<>(); //according to start
//        for (int i = 0; i < trips.length; i++) {
//            wait.offer(trips[i]);
//        }

        PriorityQueue<int[]> wait = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        for (int[] t : trips) wait.offer(t);

        PriorityQueue<int[]> loaded = new PriorityQueue<>(Comparator.comparingDouble(o -> o[2]));
        loaded.offer(trips[0]);

        while (!wait.isEmpty()) {
            if (wait.peek()[1] >= loaded.peek()[2]) {
                capacity += loaded.poll()[0];
//                loaded.poll();
            }

            if (capacity >= 0) {
                loaded.offer(wait.peek());
                capacity -= wait.poll()[0];
            }
        }
        return capacity >= 0;
    }

    public static void main(String[] args) {
        CarPooling cp = new CarPooling();

        int[][] trip = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        // {{3, 2, 7}, {8, 3, 9}, {3, 7, 9}}
        int c = 11;

        System.out.println(cp.carPooling(trip, c));
    }
}
