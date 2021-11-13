//1021
//1485 Least Number of Unique Integers after K Removals

import java.util.*;

public class LeastNumAfterRomv {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!hm.containsKey(arr[i])) hm.put(arr[i], 1);
//            else hm.put(arr[i], hm.get(arr[i]) + 1);
//        }

        for (int a : arr) hm.put(a, hm.getOrDefault(a, 0) + 1);

        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(hm.entrySet());
        // remember to pass in hm
        l.sort(Map.Entry.comparingByValue());

        int removal = 0;
        for (int i = 0; i < hm.size() && k > 0; i++) {
            k -= l.get(i).getValue();
            if (k >= 0) removal++;
        }
        return hm.size() - removal;
    }

    //assumed the removals are consecutive, so got the wrong answer.
//    public int findLeastNumOfUniqueInts(int[] arr, int k) {
//
//        int[] window = new int[k + 1];
//        //(k + 1) windows, each storing num of different elements
//        for (int i = 0; i < k + 1; i++) {
//            int start = i;
//            int end = start + arr.length - k - 1;
//            //sliding window of length: arr.l - k;
//
//            ArrayList<Integer> diffNum = new ArrayList<>();
//            for (int j = start; j <= end; j++) {
//                if (!diffNum.contains(arr[j])) diffNum.add(arr[j]);
//            }
//            //traverse through each window, counting the num of different numbers
//
//            window[i] = diffNum.size();
//
//        }
//        Arrays.sort(window);
//        return window[0];
//    }

    public static void main(String[] args) {
        LeastNumAfterRomv ln = new LeastNumAfterRomv();
        int[] ex = {2, 4, 1 ,8 ,3, 5, 1, 3};
        int k = 3;
        System.out.println(ln.findLeastNumOfUniqueInts(ex, k));
    }
}
