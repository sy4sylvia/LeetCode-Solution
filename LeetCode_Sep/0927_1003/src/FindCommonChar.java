//10/02
//1002. Find Common Characters

import java.util.ArrayList;
import java.util.List;

public class FindCommonChar {
    public List<String> commonChars(String[] words) {
        int[] table = new int[26];

        List<String> res = new ArrayList<>();
        for (int k = 0; k < words[0].length(); k++) table[words[0].charAt(k) - 'a']++;

        for (int i = 1; i < words.length; i++) {
            int[] draftTable = new int[26];
            for(int j = 0; j < words[i].length();j++) {
                draftTable[words[i].charAt(j) - 'a']++;
            }
            for (int l = 0; l < 26; l++) {
                table[l] = Math.min(draftTable[l], table[l]);
            }
        }

        for (int p = 0; p < 26; p++) {
            while (table[p] != 0) {
                res.add(Character.toString(p + 'a'));
                table[p]--;
            }
        }
//            if (table[l] >= words.length && table[l] < 2 * words.length) {
//                res.add(Character.toString(l + 'a'));
//            }
//            else if (table[l] >= 2 * words.length){
//                for (int k = 0; k < (table[l] / words.length); k++) {
//                    res.add(Character.toString(l + 'a'));
//                }
//            }
//        }
        return res;
    }

    public static void main(String[] args) {
        FindCommonChar fcc = new FindCommonChar();
        String[] words = {"cool","lock","cook"};
        fcc.commonChars(words);
    }
}
