//0930 Hash Table
//266 Palindrome Permutation


public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            hm.put(s.charAt(i), 1); //how to change increase vallue??
//        }
//        int count = 0;
//        for (int j = 0; j < )
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) table[s.charAt(i) - 'a']++;

        int count = 0;
        for (int k = 0; k < 26; k++) {
            if (table[k] % 2 == 1) count++;
        }
        if (count > 1) return false;
        else return true;
    }

    public static void main(String[] args) {
        PalindromePermutation pp = new PalindromePermutation();
        System.out.println(pp.canPermutePalindrome("aabbccc"));
    }
}
