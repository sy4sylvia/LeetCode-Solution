//1029
//179 Largest Number

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
//        if (nums == null || nums.length == 0) return "";
        String[] tmp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) tmp[i] = String.valueOf(nums[i]);
        Arrays.sort(tmp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });

        String res = String.join("", tmp);
        if (res.isEmpty() || res.charAt(0) == '0') return "0";
        else return res;
//        StringBuilder sb = new StringBuilder();
//        int[] digits = new int[nums.length];
//        int[] table = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= 10) table[nums[i] % 10] = nums[i];
//            else table[nums[i]] = nums[i];
//        }
//        return sb.toString();
//         would fail for cases: 44, 34
    }
}
