//1014
//12 Integer to Roman

public class IntToRoman {
    public String intToRoman(int num) {
//        int digits = 0;
        StringBuilder sb = new StringBuilder();

        int[] key = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        //knows the key, get the value
        String[] val = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D",  "CM", "M"};

        for (int i = key.length - 1; i >= 0 && num > 0; i--) { //num > 0 should be here
            while (num >= key[i]) { //only deduces if this element could be subtracted
                num -= key[i];
                sb.append(val[i]);
            }

        }

//        while (num > 0) {
//            int k = num % 10;
//            num /= 10;
//            digits++;
//        }
        return sb.toString();
    }


    public static void main(String[] args) {
        IntToRoman itr = new IntToRoman();
        int n = 1994;
        System.out.println(itr.intToRoman(n));

    }
}
