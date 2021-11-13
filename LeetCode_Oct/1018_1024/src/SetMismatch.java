//1024
//645 Set Mismatch

import java.util.HashMap;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
//        int[] res = {-1, 1};
        int dup = -1, missing = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for ( int n : nums) hm.put(n, hm.getOrDefault(n, 0) + 1);
        for (int i = 1; i < nums.length + 1; i++) {
            if (hm.containsKey(i)) {
                if (hm.get(i) == 2) dup = i;
            }
            else missing = i; //missing ele in the hashmap
        }
        return new int[] {dup,missing};
    }

    public static void main(String[] args) {
        SetMismatch sm = new SetMismatch();
        int[] num = {1,1};
        int[] res = sm.findErrorNums(num);
        for (int r :res) System.out.println(r);
    }
}
