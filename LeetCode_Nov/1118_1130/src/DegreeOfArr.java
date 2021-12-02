import java.util.HashMap;
import java.util.Map;

//1121
//697 Degree of an Array
public class DegreeOfArr {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, int[]> hm = new HashMap<>();
        int[] optVal = {1, 0, 0};

        hm.put(nums[0], new int[]{1, 0, 0});
        for (int i = 1; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], new int[]{1, i, i});
            }
            else {
                int[] cur = hm.get(nums[i]);
                cur[0]++;
                cur[2] = i;
                if (cur[0] > optVal[0]) {
                    optVal[0] = cur[0];
                    optVal[1] = cur[1];
                    optVal[2] = cur[2];
                }
                if (cur[0] == optVal[0]) {
                    if (optVal[2] - optVal[1] > cur[2] - cur[1]){
                        optVal[1] = cur[1];
                        optVal[2] = cur[2];
                    }
                }
            }
        }
        return optVal[2] - optVal[1] + 1;
    }

    public static void main(String[] args) {
        DegreeOfArr doa = new DegreeOfArr();
        int[] n = {1,2,2,3,1};
        System.out.println(doa.findShortestSubArray(n));
    }
}
