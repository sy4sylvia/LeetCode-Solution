//405 Add Strings
//1010


import java.util.Deque;
import java.util.LinkedList;

public class AddStrings {


    public String addStrings(String num1, String num2) {
        Deque<Character> deque = new LinkedList<>();
        int n1Idx = num1.length() - 1, n2Idx = num2.length() - 1;
        int remainder = 0;

        while (n1Idx >= 0 || n2Idx >= 0) {
            if (n2Idx < 0) {
                int tmpN1 = num1.charAt(n1Idx) - '0';
                int curr = (tmpN1 + remainder) % 10;
                remainder = (tmpN1 + remainder) / 10;
                deque.offerFirst((char)(curr + '0'));
                n1Idx--;
            }
            else if (n1Idx < 0) {
                int tmpN2 = num2.charAt(n2Idx) - '0';
                int curr = (tmpN2 + remainder) % 10;
                remainder = (tmpN2 + remainder) / 10;
                deque.offerFirst((char)(curr + '0'));
                n2Idx--;
            }
            else {
                int currSum = num1.charAt(n1Idx) - '0' + num2.charAt(n2Idx) - '0' + remainder;
                remainder = currSum / 10;
                currSum = currSum % 10;
                deque.offerFirst((char)(currSum + '0'));
                n1Idx--;
                n2Idx--;
            }
        }

        if (remainder > 0) deque.offerFirst((char)(remainder + '0'));

        char[] res = new char[deque.size()];
        int idx = 0;
        while (!deque.isEmpty()) res[idx++] = deque.pollFirst();
        return String.valueOf(res);
    }








    public String addStrings1(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        char[] c = new char[Math.max(num1.length(), num2.length())];
        int p3 = Math.max(num1.length(), num2.length()) - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 >= 0 && p2 >= 0) {
                c[p3] = (char) (num1.charAt(p1) + num2.charAt(p2));
                p1--;
                p2--;
                p3--;
            } else if (p1 >= 0 && p2 <= 0) {
                c[p3] = (char) (num1.charAt(p1));
                p1--;
                p3--;
            } else if (p2 >= 0 && p1 <= 0) {
                c[p3] = (char) (num2.charAt(p2));
                p2--;
                p3--;
            }
            String res = String.valueOf(c);
            return res;
        }
        return null;
    }

    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        String n1 = "123";
        String n2 = "934";
        System.out.println(as.addStrings(n1, n2));

    }
}
