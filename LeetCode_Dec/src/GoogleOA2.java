import java.util.Arrays;

public class GoogleOA2 {
    public static String solution(String S) {
        int[] idx = new int[26];
        Arrays.fill(idx, -1);
        //Arrays.fill(idx, -1);
        String res = String.valueOf(S.charAt(0));
        for (int i = 0; i < S.length(); i++) {
            char curC = S.charAt(i);
            if (idx[curC - 'a'] == -1) {
                idx[curC - 'a'] = i;
            }
            else {
                String subRes = S.substring(idx[curC - 'a'], i + 1);
                if (res.length() < subRes.length()) {
                    res = subRes;
                }
            }
        }
        //System.err.println("Tip: Use System.err.println() to write debug messages on the output tab.");
        return res;
    }

    public static void main(String[] args) {
        GoogleOA2 goa = new GoogleOA2();
    }
}
