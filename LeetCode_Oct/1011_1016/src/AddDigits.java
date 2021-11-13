//258 Add Digits
//1011

public class AddDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            int k = num
                    / 10;
            num %= 10;
            num += k;
        }
        return num;
    }

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(0));
    }
}
