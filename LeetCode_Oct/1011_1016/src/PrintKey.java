import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class PrintKey {
    public static void main(String[] args) {
        HashMap<Integer, Integer> team1 = new HashMap<>();
        team1.put(1, 3);
        team1.put(2, 2);
        team1.put(3, 1);

        Deque<Integer> d = new LinkedList<>();
        for (int key : team1.keySet() ) {
            d.push(key);
        }

        while (d.size() > 0) System.out.println(d.pop());
//        System.out.println(d.pop());
    }
}
