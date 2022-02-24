import java.util.*;

public class TreeMap {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> wordFreq = new HashMap<>();
        for (String w : words) wordFreq.put(w, wordFreq.getOrDefault(w, 0) + 1);

        PriorityQueue<String> minHeap = new PriorityQueue<>(
                (a, b) -> (wordFreq.get(a) == wordFreq.get(b) ? b.compareTo(a) : wordFreq.get(a) - wordFreq.get(b))
        ); //compareTo() method compares two strings lexicographically.

        for (String w : wordFreq.keySet()) {
            minHeap.offer(w);
            if (minHeap.size() > k) minHeap.poll();
        }
        List<String> l = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            l.add(0, minHeap.poll());
            System.out.println(l.get(0)); //day is first inserted, so it's at the end of the list
        }
        for (String str: l) System.out.print(str + " ");
        return l;
    }

    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        tm.topKFrequent(words, 4);
    }
}
