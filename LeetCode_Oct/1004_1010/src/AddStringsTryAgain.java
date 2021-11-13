import java.util.Deque;
import java.util.LinkedList;

//1010
public class AddStringsTryAgain {
    public String addStrings(String num1, String num2) {
        Deque<Character> d = new LinkedList<>();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int quotient = 0;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                int sum =  num2.charAt(p2) - '0' + quotient;
                quotient = sum / 10;
                sum %= 10;
                d.offerFirst((char)(sum + '0'));
                p2--;
            }
            else if (p2 < 0) {
                int sum = num1.charAt(p1) - '0' + quotient;
                quotient = sum / 10;
                sum %= 10;
                d.offerFirst((char)(sum + '0'));
                p1--;
            }
            else {
                int sum = num1.charAt(p1) - '0' + num2.charAt(p2) - '0' + quotient;
                quotient = sum / 10;
                sum %= 10;
                d.offerFirst((char)(sum + '0'));
                p1--;
                p2--;
            }

        }

        if (quotient > 0) d.offerFirst((char)(quotient + '0'));
        System.out.println(d);
        char[] res = new char[d.size()];
        int i = 0;
        while (!d.isEmpty()) {
            res[i] = d.pollFirst();
            i++;
        }
        String result = String.valueOf(res);
        return result;
    }

    public static void main(String[] args) {
        AddStringsTryAgain asta = new AddStringsTryAgain();
        String n1 = "222";
        String n2 = "888";
        System.out.println(asta.addStrings(n1, n2));
    }
}
