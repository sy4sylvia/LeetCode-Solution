//9

public class palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0 || ( x != 0 && x % 10 == 0)) return false;
            int y = 0;
            while (x > y) {
                y = x % 10 + y * 10;
                x = x / 10;
            }
            return (x == y / 10 || x == y);
        }
    public static void main(String[] args) {
        palindrome p = new palindrome();
        System.out.println(p.isPalindrome(10021));
    }
}
