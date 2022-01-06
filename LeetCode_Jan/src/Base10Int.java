//0103
//1009 Complement of Base 10 Integer

public class Base10Int {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') sb.append("0");
            else sb.append("1");
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
