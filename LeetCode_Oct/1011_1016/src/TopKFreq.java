//347 Top K Frequent Elements
//1015

import java.util.*;

// a private class to sort by values in HashMap
// 2 HashMaps: too much space, waste of time

public class TopKFreq {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) hm.put(num, hm.getOrDefault(num, 0) + 1);
        HashMap<Integer, Integer> resHM = sortByVal(hm);
        Deque<Integer> d = new LinkedList<>();
        for (int key : resHM.keySet()) d.push(key);
        for (int i = 0; i < k; i++) res[i] = d.pop();
        return res;
    }

    //sort values of hm and return the top k keys
    private static HashMap<Integer, Integer> sortByVal(HashMap<Integer, Integer> hm) {
        //create a list from elements of hm
        //pass in hm when creating
        List<Map.Entry<Integer, Integer>> l = new LinkedList<>(hm.entrySet());

        //sort the list
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            } //created by IntelliJ, overriding compare
        });
        //from list to new hash map
        HashMap<Integer, Integer> nhm = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> m : l) nhm.put(m.getKey(), m.getValue());
        return nhm;
    }

    public static void main(String[] args) {
        TopKFreq tkf = new TopKFreq();
        int[] n = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = tkf.topKFrequent(n, k);
        for (int i = 0; i < k; i++) System.out.println(ans[i]);
    }
}
