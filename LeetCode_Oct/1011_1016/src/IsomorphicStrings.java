//1018
//205 Isomorphic Strings

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
//        int[] table1 = new int[256]; //256 characters in ASCII
//        int[] table2 = new int[256];
//        for (int i = 0; i < s.length(); i++) {
////            if (table[s.charAt(i)] != table[t.charAt(i + 256)]) return false;
////            table[s.charAt(i)] = i + 1;
//            table1[s.charAt(i) - 'a']++;
//            table2[t.charAt(i) - 'a']++;
//        }


        HashMap st = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.containsKey(s.charAt(i))) {
                st.put(s.charAt(i),i);
            }
            if (!st.containsKey(Character.toString(t.charAt(i)))) {
                st.put(Character.toString(t.charAt(i)), i);
            }
            if (st.get(s.charAt(i)) != st.get(Character.toString(t.charAt(i)))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        String s1 = "paper";
        String s2 = "title";
        System.out.println(is.isIsomorphic(s1, s2));
    }
}
