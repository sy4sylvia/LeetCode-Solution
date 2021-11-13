//242 Valid Anagram
//0930 Hash Map / Hash Table

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        //hash table
        if (s.length() != t.length()) return false;

        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) table[s.charAt(i) - 'a']++;
        for (int j = 0; j < t.length(); j++) table[t.charAt(j) - 'a']--;
        for (int k = 0; k < 26; k++) {
            if (table[k] != 0) return false;
        }
        return true;

        //sorting - accepted
//        if (s.length() != t.length()) return false;
//        char[] c1 = s.toCharArray();
//        char[] c2 = t.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        return Arrays.equals(c1, c2);
    }
}
