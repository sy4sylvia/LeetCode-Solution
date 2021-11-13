//1018
//290 Word Pattern

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        else {
            HashMap st = new HashMap<>();
            for (Integer i = 0; i < words.length; i++) {
                if (!st.containsKey(pattern.charAt(i))) {
                    st.put(pattern.charAt(i),i);
                }
                if (!st.containsKey(words[i])) {
                    st.put(words[i], i);
                }
                if (st.get(pattern.charAt(i)) != st.get(words[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        String p = "bbaa";
        String ex = "e e g g";
        System.out.println(wp.wordPattern(p, ex));
    }
}
