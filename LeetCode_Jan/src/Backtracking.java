import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {

    //0125
    //267. Palindrome Permutation II
    List<String> permu = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    StringBuilder mid = new StringBuilder();
    int[] table = new int[26];

    public List<String> generatePalindromes(String s) {
        //check if palindromic
        for (int i = 0; i < s.length(); i++) table[s.charAt(i) - 'a']++;
        //length: even number: abba, abca, abbbccca -> must be of even freq
        //length: odd number: aba, abc -> one odd freq, other even freq
        for (int i = 0; i < 26; i++) {
            if (table[i] % 2 != 0) mid.append((char) (i + 'a'));
        }
        if (mid.length() > 1) return new ArrayList<>(); //not palindromic

        //form first half of the array
        StringBuilder halfString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int halfFreq = table[i] / 2;
            while (halfFreq > 0) {
                halfString.append((char) (i + 'a'));
                halfFreq--;
            }
        }

        System.out.println(halfString);

        //start backtracking for permutations

        boolean[] used = new boolean[halfString.length()];

        char[] c = halfString.toString().toCharArray();

        Arrays.sort(c);

        backtrack(s, c, used);
        return permu;
    }



    private void backtrack(String s, char[] c, boolean[] used) {
        //base case, termination
        if (sb.length() == c.length) {
            permu.add(sb.toString() + mid + sb.reverse().toString());
            sb.reverse();
            return;
        }

        for (int i = 0; i < c.length; i++) { //for loop: on the same level
            if (i >= 1 && c[i] == c[i - 1] && !used[i - 1]) continue; //same value on this level, already used
            if (used[i]) continue;

            used[i] = true;
            sb.append(c[i]);
            backtrack(s, c, used);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }


    public static void main(String[] args) {
        Backtracking b = new Backtracking();
        String s = "aabb";
        System.out.println(b.generatePalindromes(s));
    }
}
