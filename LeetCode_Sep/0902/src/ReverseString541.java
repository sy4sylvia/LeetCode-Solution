//541

public class ReverseString541 {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();

        int set = c.length / (2 * k), remaining = c.length % (2 * k);

        int left = 0, right = k - 1, count = 0;

        for(int i = 0; i < set; i++){
            while(left < right){
                char temp = c[left];
                c[left++] = c[right];
                c[right--] = temp;
            }
            count++;
            left = count * 2 * k;
            right = left + k - 1;
        }

        if(remaining > 0 && remaining <= k){
            int l = set * 2 * k;
            int r = c.length - 1;
            while(l < r){
                char temp2 = c[l];
                c[l++] = c[r];
                c[r--] = temp2;
            }
        }
        else if(remaining > k && remaining < (2 * k)){
            int l = set * 2 * k;
            int r = set * 2 * k + k - 1;
            while(l < r) {
                char temp2 = c[l];
                c[l++] = c[r];
                c[r--] = temp2;
            }
        }
        String s2 = String.valueOf(c);
        return s2;
    }

    public static void main(String[] args) {
        ReverseString541 rs2 = new ReverseString541();
        String s = "abcdefghijkl";
        System.out.println(rs2.reverseStr(s, 4));
    }
}
