//238 Product of Array Except Self
//1030

//-30 <= nums[i] <= 30

public class ProductOfArr {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1, indexZero = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) indexZero = i;
            sum *= nums[i];
        }
        if (sum != 0) {
            for (int i = 0; i < ans.length; i++) ans[i] = sum / nums[i];
        }
        else {
            int i = 0, newSum = 1;
            while (i < nums.length) {
                if (i != indexZero) newSum *= nums[i];
                i++;
            }
            ans[indexZero] = newSum;
        }
        return ans;
    }

    public static void main(String[] args) {
        ProductOfArr poa = new ProductOfArr();
        int[] n = {-1, 2, 3, 4, 0};
        int[] re = poa.productExceptSelf(n);
        for (int r : re) System.out.println(r);
    }
}
