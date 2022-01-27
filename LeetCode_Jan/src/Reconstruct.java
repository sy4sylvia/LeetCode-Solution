//0126
//332. Reconstruct Itinerary


import java.util.*;

//You must use all the tickets once and only once.

public class Reconstruct {
    List<String> res = new ArrayList<>();
    Map<String , Map<String, Integer>> map = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
//        HashSet<String> nodes = new HashSet<>();
        for (List<String> l : tickets) {
            Map<String, Integer> tmp;
            if (map.containsKey(l.get(0))) {
                tmp = map.get(l.get(0));
                tmp.put(l.get(1), tmp.getOrDefault(l.get(1), 0) + 1);
            }
            else {
                tmp = new TreeMap<>();//升序Map
                tmp.put(l.get(1), 1);
            }

            map.put(l.get(0), tmp);
        }

        res.add("JFK");
        backtrack(tickets.size());
        return new ArrayList<>(res);
    }

    private boolean backtrack(int ticketNum) {
       if (res.size() == ticketNum + 1) return true;

       String last = res.get(res.size() - 1);
       if (map.containsKey(last)) {
           for (Map.Entry<String, Integer> target: map.get(last).entrySet()) {
               int count = target.getValue();
               if (count > 0) {
                   res.add(target.getKey());
                   target.setValue(count - 1);
                   if (backtrack(ticketNum)) return true;
                   res.remove(res.size() - 1);
                   target.setValue(count);
               }
           }
        }
       return false;
    }
}
