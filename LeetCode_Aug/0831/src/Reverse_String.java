//344

public class Reverse_String {
    public void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
//        String ss= Character.toString(char);
//        char temp;
        while (left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
//            left++;
//            right--;
        }
//        System.out.println(s);
    }

    public static void main(String[] args) {
        Reverse_String rs = new Reverse_String();
        String s = "whatever";
        char[] c = s.toCharArray();
        System.out.println(s);
        rs.reverseString(c);
//        char[] charnew = new char[]{'h','e', 'l', 'l', 'o'};
//        for(int i: charnew) System.out.println(rs + " ");
//        System.out.println();

        String s2 = String.valueOf(c);
        System.out.println(s2);
    }
}


