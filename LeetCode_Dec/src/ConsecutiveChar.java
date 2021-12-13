//1212
//1446. Consecutive Characters

public class ConsecutiveChar {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            char curC = s.charAt(i);
            if (prev == curC) {
                count++;

            }
            else {
                prev = s.charAt(i);
                count = 1;
//                max = Math.max(max, count);
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "google";
        ConsecutiveChar cc = new ConsecutiveChar();
        System.out.println(cc.maxPower(s));
    }
}
