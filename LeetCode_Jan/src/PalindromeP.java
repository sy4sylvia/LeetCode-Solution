//0104
//131. Palindrome Partitioning

//backtrack

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PalindromeP {

    List<List<String>> res = new ArrayList<>();
    Deque<String> dq = new LinkedList<>();

    public List<List<String>> partition(String s) {

        return res;
    }

    private void backtrack(String s, int startIdx) {
        if (startIdx >= s.length()) {
            res.add(new ArrayList<>(dq));
            return;
        }

    }
}

