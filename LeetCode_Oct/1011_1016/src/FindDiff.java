//1016
//389 Find the Difference

public class FindDiff {


    //HashTable
//    public char findTheDifference(String s, String t) {
//        char res = ' ';
//        int[] table = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            table[t.charAt(i) - 'a']++;
//            table[s.charAt(i) - 'a']--;
//        }
//        table[t.charAt(t.length() - 1) - 'a']++;
//
//        for (int k = 0; k < 26; k++) {
//            if (table[k] == 1) {
//                res = (char) (k + 'a');
//                break;
//            }
//        }
//        return res;
//    }

    //bit manipulation
    public char findTheDifference(String s, String t) {
        char c = 0; // char c = 0, not '0' '0' is actually 48
        for (int i = 0; i < s.length(); i++) c ^= s.charAt(i);
        for (int i = 0; i < t.length(); i++) c^= t.charAt(i);
        return c;
    }

    public static void main(String[] args) {
        FindDiff fd = new FindDiff();

        String s = "cd", t = "bcd";
        System.out.println(fd.findTheDifference(s, t));

    }
}
