import java.util.ArrayList;
import java.util.List;

public class EqualLevels {
    public static int updateTimes(List<Integer> signalOne, List<Integer> signalTwo) {
        int initial = 0, count = 0;
        for (int i = 0; (i < signalOne.size() - 1) && (i < signalTwo.size() - 1); i++) {
            if (signalOne.get(i) == signalTwo.get(i) && signalOne.get(i) > initial && signalTwo.get(i) > initial) {
                count++;
                initial = signalOne.get(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        EqualLevels el = new EqualLevels();

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
//        l1.add(3);
//        l1.add(5);
        l1.add(4);
        l1.add(5);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(5);
        l2.add(4);
        l2.add(3);
        l2.add(2);
        l2.add(1);
//        l2.add(2);
        System.out.println(updateTimes(l1, l2));

    }
}
