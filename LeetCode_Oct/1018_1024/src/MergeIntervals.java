//import java.util.ArrayList;
////1023
////56 Merge Intervals
//
//public class MergeIntervals {
////    public int[][] merge(int[][] intervals) {
////        int size1 = intervals.length;
////        ArrayList<int[]> sorted = new ArrayList<>();
////
////        for(int i = 0; i < size1 - 1; i++) {
////            if(intervals[i][1] > intervals[i + 1][0]) {
////                intervals[i][1] = intervals[i + 1] [1];
////                int[] temp = {intervals[i][0], intervals[i + 1][1]};
////                sorted.add(temp);
////                i++;
////            }
////            else {
////                int[] tmp = {intervals[i][0], intervals[i][1]};
////                sorted.add(tmp);
////            }
////        }
////
////        int[] last = {intervals[size1 - 1][0],intervals[size1 - 1][1]};
////        sorted.add(last);
////
////        int[][] result = new int[sorted.size()][];
////        for(int k = 0; k < sorted.size(); k++) {
////            result[k] = sorted.get(k);
////        }
//////
//////        int[][] result = (int[][]) sorted.toArray();
////        return result;
////    }
//
//
//    public int[][] merge(int[][] intervals) {
//
//    }
//
//
//    public static void main(String[] args) {
//        MergeIntervals mi = new MergeIntervals();
//
//    }
//
//
//}
