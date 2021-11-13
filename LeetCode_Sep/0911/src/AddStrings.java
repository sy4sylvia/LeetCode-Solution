//0914 415

class AddStrings {
    public String addStrings(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1 + number2;
        String result = Integer.toString(sum);
        return result;
    }

    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        String n1 = "12182";
        String n2 = "22213131";
        System.out.println(as.addStrings(n1, n2));
    }
}
