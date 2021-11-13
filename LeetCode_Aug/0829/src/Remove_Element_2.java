import java.util.Arrays;

public class Remove_Element_2 {
    public int removeElement(int[] nums, int val){
        int i = 0;
        int CountExchange = 0;
        int left = 0;
        Arrays.sort(nums);

        while(i < nums.length){
            if(nums[i] == val){
                int n = nums[i];
                nums[i] = nums[left];
                nums[left] = n;
                CountExchange++;
                left++;
            }
            i++;
//            for(int x = 0; nums[x] == val; x++){
//                int a = nums[x];
//                nums[x] = nums[nums.length - 1 - x];
//                nums[nums.length - 1 - x] = a;
//            }
        }

        for (int u = CountExchange; u < nums.length; u++) {
            nums[u - CountExchange] = nums[u];
        }

        return (nums.length - CountExchange);
    }

    public static void main(String[] args) {
        Remove_Element_2 re = new Remove_Element_2();
        int[] numsnew = new int[]{3, 2, 2, 2, 1, 3, 3};
        // 1222333
        // 3331222
        // 1222 222
        System.out.println(re.removeElement(numsnew, 3));

    }
}
