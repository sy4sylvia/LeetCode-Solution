//1016
//136 Single Number

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SingleNum {
    public int singleNumber(int[] nums) {
        //bit manipulation
        int xor = 0;
        for (int i = 0; i < nums.length; i++) xor ^= nums[i];
        return xor;


//        // HashMap
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        int res = 0;
//        for (int n = 0; n < nums.length; n++) hm.put(nums[n], hm.getOrDefault(nums[n], 0) + 1);
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            if (Objects.equals(1, entry.getValue())) res = entry.getKey();
//        }
//        return res;
    }


//    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
//        for (Entry<T, E> entry : map.entrySet()) {
//            if (Objects.equals(value, entry.getValue())) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) {
        SingleNum sn = new SingleNum();
        int[] exa = {4,1,2,1,2};
        System.out.println(sn.singleNumber(exa));
    }
}
