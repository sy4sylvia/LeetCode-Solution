import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        if (strs.length == 1) return strs[0];
        else {
            if (strs[0].length() > 0) {
                if (strs[0].charAt(0) != strs[strs.length - 1].charAt(0)) return "";
                else {
                    for (int i = 0; i < strs[0].length(); i++) {
                        if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                            sb.append(strs[0].charAt(i));
                        }
                        else break;
                    }
                    return sb.toString();
                }
            }
            else return "";
        }


//
//        else if (strs[0].charAt(0) != strs[strs.length - 1].charAt(0)) return "";
//        else {
//            for (int i = 0; i < strs[0].length(); i++) {
//                if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
//                    sb.append(strs[0].charAt(i));
//                }
//            }
//            return sb.toString();
//        }
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] s = {"cir", "car"};
        System.out.println(lcp.longestCommonPrefix(s));
    }
}
