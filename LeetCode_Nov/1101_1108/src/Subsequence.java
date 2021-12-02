//1114
//392 Is Subsequence

public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int sIndex = 0, tIndex = 0;
        int flag = 0;

        //two pointers, respectively in two char[]s, move
        while (sIndex < s.length() && tIndex < t.length()) {
            if (sChar[sIndex] == tChar[tIndex]) {
                sIndex++;
                flag++;
            }
            tIndex++;
        }

        return flag == sChar.length;
    }

    public static void main(String[] args) {
        Subsequence sub = new Subsequence();
        String s = "aed", t = "abcde";
        System.out.println(sub.isSubsequence(s, t));
    }
}
