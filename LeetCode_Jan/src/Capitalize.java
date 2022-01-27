

public class Capitalize {
    public String capitalizeTitle(String title) {
        //'a' = 97, 'A' = 65
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(" ");

        String[] words = sb.toString().split(" ");

        sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.length() <= 2) {
                //lowerCase
                w = helperLower(w).toString();
                sb.append(w);
                sb.append(" ");
            }
            else {
                int tmp = w.charAt(0);
                if (tmp > 90) tmp -= 32; //lower to upper
                sb.append((char) tmp);

                StringBuilder lastHalf = helperLower(w.substring(1));
                sb.append(lastHalf);

                sb.append(" ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private StringBuilder helperLower(String w) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            int tmp = w.charAt(i);
            if (tmp <= 90) tmp += 32; //upper to lower
            sb.append((char) tmp);
        }
        return sb;
    }

    public static void main(String[] args) {
        Capitalize c = new Capitalize();
        System.out.println(c.capitalizeTitle("i lOve leetcode"));
    }
}
