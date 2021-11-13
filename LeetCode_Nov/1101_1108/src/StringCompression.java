//1105
//443 String Compression
//two pointers

public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        else {
            int left = 0, right = left + 1;
            StringBuilder sb = new StringBuilder();

            while (right < chars.length) {
                sb.append(chars[left]);
                while (right < chars.length && chars[left] == chars[right]) {
                    right++;
                }
                if (right - left != 1) sb.append(right - left);
                if (right == chars.length) break;

                left = right;
                right = left + 1;
            }
            if (chars[chars.length - 1] != chars[chars.length -2]) {
                sb.append(chars[chars.length - 1]);
            }

            System.out.println(sb);
            for (int i = 0; i < sb.length(); i++) {
                chars[i] = sb.charAt(i);
            }
            return sb.length();
        }
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] c = {'a', 'b', 'c'};
        System.out.println(sc.compress(c));
    }
}
