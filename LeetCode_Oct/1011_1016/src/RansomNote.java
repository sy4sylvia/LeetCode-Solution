//1011
//383 Ransom Note
//HashTable
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[26];
        for (int i = 0; i < magazine.length(); i++) table[magazine.charAt(i) - 'a']++;
        for (int j = 0; j < ransomNote.length(); j++) table[ransomNote.charAt(j) - 'a'] --;
        for (int m = 0; m < 26; m++) {
            if (table[m] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        String ran = "aacc";
        String maga = "aabbccdd";
        System.out.println(rn.canConstruct(ran,maga));
    }
}
