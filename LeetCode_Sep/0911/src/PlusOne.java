import com.sun.source.tree.BreakTree;

//0913 66 Plus One
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] arrNew = new int[digits.length];
        int[] arrrrr = new int[digits.length + 1];
        System.arraycopy(digits, 0, arrNew, 0, digits.length);
        if (arrNew[digits.length - 1] < 9) {
            arrNew[digits.length - 1] += 1;
            return arrNew;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    arrNew[i] = 0;
//                    if(digits[0] == 9){
//                        arrrrr[0] = 1;
//                        return arrrrr;
                } else {
                    arrNew[i] = digits[i] + 1;
                    break;
                }
            }
            if (arrNew[0] == 0) {
                arrrrr[0] = 1;
                return arrrrr;
            }
            else{
                return arrNew;
            }

        }
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] arrrr = {9};
        int[] result = po.plusOne(arrrr);
        for (int k = 0; k < 2; k++) {
            System.out.println(result[k]);
        }
    }
}
//        int[] arr = new int[digits.length];
//        int[] arrNew = new int[digits.length + 1];
//        System.arraycopy(digits, 0, arr, 0, digits.length);
//        if (arr[digits.length - 1] < 9) {
//            arr[digits.length - 1] += 1;
//            return arr;
//        } else {
//            if (digits.length < 2) {
//                arrNew[0] = 1;
//                arrNew[1] = 0;
//                return arrNew;
//            }
//            else {
//                arr[digits.length - 2] = digits[digits.length - 2] + 1;
//                arr[digits.length - 1] = 0;
//                int count = 0;
//                for (int i = digits.length - 1; i >= 0; i--) {
//                    if (digits[i] == 9) {
//                        count++;
//                    }
//                }
//                if (count == digits.length) {
//                    arrNew[0] = 1;
//                    return arrNew;
//                } else {
//                    return arr;
//                }
//            }
//
//        }




