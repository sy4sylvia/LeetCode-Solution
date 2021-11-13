//1018
//1876 Substrings of Size Three with Distinct Characters

public class SubOfThreeDistinct {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        else {
            int count = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) != s.charAt(i + 1)  && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2)) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        SubOfThreeDistinct ss = new SubOfThreeDistinct();
        String st = "as";
        System.out.println(ss.countGoodSubstrings(st));
    }
}
