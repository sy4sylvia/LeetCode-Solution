//27

import java.util.Arrays;

public class Remove_Element {
    public int removeElement(int[] nums, int val){
        int i = 0;
        int k = 0;
        int left = 0;
//        int right = nums.length - 1;
        Arrays.sort(nums);

//        while(i < right){
        while(i < nums.length){
            if(nums[i] == val){
                int n = nums[i];
                nums[i] = nums[left];
//                nums[i] = nums[right];
//                nums[right] = n;
                nums[left] = n;
                k++;
//                right--;
                left++;
            }
            i++;
        }

        if(nums[left] == val){
            return (nums.length - k - 1);
        }
        else{
            return (nums.length - k);
        }

//        for(i = 0; i < nums.length && nums[i] == val; i++){
//            int a = nums[i];
//            nums[i] = nums[nums.length - 1 - i];
//            nums[nums.length -1 - i] = a;
//        }
    }

    public static void main(String[] args) {
        Remove_Element re = new Remove_Element();
        int[] numsnew = new int[]{3, 2, 2, 2, 1, 3, 3};
        System.out.println(re.removeElement(numsnew, 3));
    }
}
