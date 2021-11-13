public class Remove_Element_3 {
    public int removeElemnt(int[] nums, int val){
        int i = 0;
        int Count = 0;

        while(i < nums.length){
            if(nums[i] != val){
                nums[Count] = nums[i];
                Count++;
            }
            i++;
        }
        return Count;
    }

    public static void main(String[] args) {
        Remove_Element_3 re = new Remove_Element_3();
        int[] numsnew = new int[]{3, 2, 2, 2, 1, 3, 3};
        System.out.println(re.removeElemnt(numsnew, 1));
    }
}
