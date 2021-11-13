import java.util.HashMap;

public class SparseVector {
    private int[] nums;
    HashMap<Integer, Integer> hm = new HashMap<>();

    SparseVector(int[] nums) {
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) this.hm.put(i, nums[i]);
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int res = 0;
        for (int i : this.hm.keySet()) {
            if (vec.hm.containsKey(i)) res += this.hm.get(i) * vec.hm.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = {0,1,0,0,2,0,0};
        SparseVector sv = new SparseVector(n);
        int[] n2 = {1,0,0,0,3,0,4};
        SparseVector sv2 = new SparseVector(n2);
        System.out.println(sv.dotProduct(sv2));
    }
}
