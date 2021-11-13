//import java.util.Collections;
//import java.util.PriorityQueue;
//
//public class FindMedian {
//    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
//    //max-heap; in java, the priority queue is by default min-heap;
//    private PriorityQueue<Integer> large = new PriorityQueue<>();
//    private boolean even = true;
//
//    public MedianFinder() {
////        MedianFinder obj = new MedianFinder();
////        obj.addNum(num);
////        double param_2 = obj.findMedian();
//
//        //used by other classes?
//    }
//
//    public void addNum(int num) {
//        if (even) {
//            large.offer(num);
//            small.offer(large.poll());
//        }
//        else {
//            small.offer(num);
//            large.offer(small.poll());
//        }
//        even = !even;
//    }
//
//    public double findMedian() {
//        if (even) return (small.peek() + large.peek()) / 2.0;
//        else return small.peek();
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
