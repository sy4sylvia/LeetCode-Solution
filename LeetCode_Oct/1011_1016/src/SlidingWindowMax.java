//239 Sliding Window Maximum
//1014

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> d = new LinkedList<>();


        return res;
    }

    public static void main(String[] args) {
        SlidingWindowMax swm = new SlidingWindowMax();
        int[] number = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = swm.maxSlidingWindow(number, k);
        for (int i = 0; i < number.length - k + 1; i++) {
            System.out.println(result[i]);
        }
    }
}
