//1024
//1470 Shuffle the Arrray

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int k = 0;
        for (int i = 0; i < res.length; i+= 2) res[i] = nums[k++];
        for (int i = 1; i < res.length + 1; i+= 2) res[i] = nums[k++];
        return res;
    }

    public static void main(String[] args) {
        Shuffle shu = new Shuffle();
        int[] numb = {2,5,1,3,4,7};
        int k = 2;
        int[] result = shu.shuffle(numb, k);
        for (int n : result) System.out.println(n);
    }
}
