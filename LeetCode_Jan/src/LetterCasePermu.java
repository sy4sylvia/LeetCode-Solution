import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//0126
//784. Letter Case Permutation

public class LetterCasePermu {

    List<String> res = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        char[] c = s.toCharArray();
        backtrack(c, 0);
        return res;
    }

    private void backtrack(char[] c, int idx) {
        if (idx == c.length) {
            res.add(new String(c));
            return;
        }

        if (Character.isLetter(c[idx])) {
            //first backtrack uppercase
            c[idx] = Character.toUpperCase(c[idx]);
            backtrack(c, idx + 1);
            //then backtrack lowercase
            c[idx] = Character.toLowerCase(c[idx]);
            backtrack(c, idx + 1);
        }
        else backtrack(c, idx + 1);//isDigit
    }
}
