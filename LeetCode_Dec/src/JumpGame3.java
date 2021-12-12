//1209
//1306. Jump Game III

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame3 {
//    public boolean canReach(int[] arr, int start) {
//        //BFS, q
//        Queue<Integer> q = new LinkedList<>();
//        q.add(start); // store indexes
//
//        while (!q.isEmpty()) {
//            int idx = q.poll();
//            if (arr[idx] == 0) return true;
//            if (arr[idx] < 0) continue; //this node has already been visited
//             //i + arr[i] or i - arr[i], compare with index
//            if (idx + arr[idx] < arr.length) q.offer(idx + arr[idx]);
//            if (idx - arr[idx] >= 0) q.offer(idx - arr[idx]); //jump to this index
//
//            arr[idx] = -arr[idx];
//        }
//        return false;
//    }


    //DFS
    public boolean canReach(int[] arr, int start) {
        if (start >= 0 && start < arr.length && arr[start] >= 0) {
            if (arr[start] == 0) return true;
            arr[start] = -arr[start];
            return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame3 jg3 = new JumpGame3();
        int[] a = {4,2,3,0,3,1,2};
        int start = 5;
        System.out.println(jg3.canReach(a, start));
    }

}
