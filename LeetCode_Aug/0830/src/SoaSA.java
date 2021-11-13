//977_faster

public class SoaSA {
    public int[] sortedSquares(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int[] numsquares = new int[nums.length];

        int i = 0;

        while (left <= right){
            if(Math.abs(nums[left]) <= Math.abs(numsquares[right])){
                numsquares[i] = nums[left] * nums[left];
                left++;

            }
            else{
                numsquares[i] = nums[right] * nums[right];
                right--;
            }
            i++;
        }

//        int a = 0;
//        int b = nums.length - 1;
//        int[] sortedsq = new int[nums.length - 1];
//        while(a < (nums.length - 1) && b < (nums.length - 1) &&a < b){
//            int c = sortedsq[a];
//            sortedsq[a] = sortedsq[b];
//            sortedsq[b] = c;
//            a++;
//            b--;
//        }

        return numsquares;
    }

    public static void main(String[] args) {
        SoaSA sa = new SoaSA();
        int[] numsnew = new int[]{-2, -1, 2, 3, 10};
        int[] result = sa.sortedSquares(numsnew);
        for (int i: result) System.out.print(i + " ");
        System.out.println();
    }
}
