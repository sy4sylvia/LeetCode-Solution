//1230
//17 Letter Combination of a Phone Number

//
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterComPhoneNo {

    StringBuilder sb = new StringBuilder();
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        int level = digits.length();
        if (level == 0) return new ArrayList<>();
        else {
            String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            helperBacktrack(digits, letters, level, 0);
        }
        return res;
    }

    private void helperBacktrack(String digits, String[] letters, int level, int curLevel) {
        if (curLevel == level) {
            String subString = sb.toString();
            res.add(subString);
            return;
        }
        String curString = letters[digits.charAt(curLevel) - 48]; //'0' = 48
        System.out.println(curString);
        for (int i = 0; i < curString.length(); i++) {
            sb.append(curString.charAt(i));
            helperBacktrack(digits, letters, level, curLevel + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
