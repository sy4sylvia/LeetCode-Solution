//541 Reverse String II

public class Reverse_String_II {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();

        int i = c.length / (2 * k), remaining = c.length % (2 * k);
        int m = 0;
        int left = m, right = m + k - 1;

//        if(remaining == 0){
//            while(right < c.length - 1){
//                for(left = m, right = m + k - 1; left < (3 * k - 1) && right > 0 && left < right ; left++, right--){
//                    char temp = c[left];
//                    c[left] = c[right];
//                    c[right] = temp;
//                }
//                m += 2 * k;
//            }
//
//        }



//                if (left < i + (k - 1) && right > 0 && left < right) {
//                    char temp = c[left];
//                    c[left] = c[right];
//                    c[right] = temp;
//                    left++;
//                    right--;
//                }
//                else{
//                    i = 2 * k;
//                    left = i;
//                    right = i + k - 1;
//                    char temp = c[left];
//                    c[left] = c[right];
//                    c[right] = temp;
//                }




//        If there are fewer than k characters left,
//        reverse all of them.
//        If there are less than 2k but greater than or equal to k characters,
//        then reverse the first k characters and left the other as original.
        String s2 = String.valueOf(c);
        return s2;
    }

    public static void main(String[] args) {
        Reverse_String_II rs2 = new Reverse_String_II();
        String s = "abcdefg";
        System.out.println(rs2.reverseStr(s, 2));
    }
}
