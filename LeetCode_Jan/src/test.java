import java.util.ArrayList;
import java.util.List;

public class test {

    public static List<List<String>> validateImageSize(List<List<String>> imageUrls, String maxSize) {
        // Write your code here
        List<List<String>> res = new ArrayList<>();
        String maxStr = sizeCvt(maxSize);

        return res;
    }
    public static String workable(String query, String support) {
        if (query.length() > support.length()) return "FALSE";
        if (query.length() < support.length()) return "TRUE";
        if (query.compareTo(support) <= 0) return "TRUE";
        return "FALSE";
    }
    public static String sizeCvt(String s) {
        if (s.equals("none")) return "1000000";

        int N = s.length();
        char sign = s.charAt(N - 2);
        String head = s.substring(0, N - 2);
        if (sign == 'k' || sign == 'K') {
            return head + "000";
        }
        else if (sign == 'm' || sign == 'M') {
            return head + "000000";
        }
        else if (sign == 'g' || sign == 'G') {
            return head + "000000000";
        }
        return "";
    }
}
