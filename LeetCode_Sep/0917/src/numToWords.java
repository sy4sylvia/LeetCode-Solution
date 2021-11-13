//273 Integer to Words

public class numToWords {
    String[] oneDigit = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] twoDigits = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] plusTens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        else return helper(num);
    }
    private String helper(int num) {
        String result = new String();
        if (num < 10) result = oneDigit[num];
        else if (num < 20) result = twoDigits[num % 10];
        else if (num < 100) result = plusTens[num / 10] +" " + helper(num % 10);
        else if (num < 1000) result = oneDigit[num / 100] + " Hundred " +  helper(num % 100);
        else if (num < 1000000) result = helper(num / 1000) + " Thousand " +  helper(num % 1000);
        else if (num < 1000000000) result = helper(num / 1000000) + " Million " +  helper(num % 1000000);
        else result = helper(num / 1000000000) + " Billion " +  helper(num % 1000000000);
        return result.trim();
    }

    public static void main(String[] args) {
        numToWords words = new numToWords();
        int number = 20;
        System.out.println("The number " + number + " in English is " + words.numberToWords(number));

    }
}
