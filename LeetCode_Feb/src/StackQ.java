import java.util.Stack;

public class StackQ {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> mono = new Stack<>();
        mono.push(0); //use the monotonic stack to record idx intead of vals
        int[] res = new int[n];
        if (n == 1) return res;
        ///75 71 69 72 -> 75 72
        //2 3 4 5. 71 to 72 2
        for (int curIdx = 0; curIdx < n; curIdx++) {
            int curT = temperatures[curIdx];
            if (curT <= temperatures[mono.peek()]) mono.push(curIdx);
            else {
                while (!mono.isEmpty() && curT > temperatures[mono.peek()]) {
                    int preIdx = mono.pop();
                    res[preIdx] = curIdx - preIdx;
                }
                mono.push(curIdx);
            }
        }
        return res;
    }
}
