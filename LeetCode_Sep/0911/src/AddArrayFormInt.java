//0914 989
import java.util.LinkedList;
import java.util.List;

class AddArrayFormInt {
    public List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> integerK = new LinkedList<Integer>();
//        while (k > 10) {
//            integerK.add(k / 10);
//        }
//        integerK.add(k % 10);
//
//        List<Integer> nums = new LinkedList<Integer>();
//        for(int i = 0; i < num.length; i++) {
//            nums.add(num[i]);
//        }
        List<Integer> sum = new LinkedList<Integer>();
        for(int i = num.length - 1; i >= 0; i--) {
            sum.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            sum.add(0, k % 10);
            k = k / 10;
        }
//        while (k > 10) {
//            sum.add(k % 10);
//            k = k / 10;
//        }
//        sum.add(k % 10);

        return sum;
    }

    public static void main(String[] args) {
        AddArrayFormInt aafi = new AddArrayFormInt();
        int[] arr = {9, 9, 9};
        int constant = 2;
        List l = aafi.addToArrayForm(arr, constant);
        System.out.println(l);

    }
}
