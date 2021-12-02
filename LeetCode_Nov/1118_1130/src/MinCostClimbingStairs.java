//1122
//746. Min Cost Climbing Stairs

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) return Math.min(cost[0], cost[1]);
        if (cost.length == 3) return Math.min(cost[1], (cost[0] + cost[2]));
        int[] finalCost = new int[cost.length];
        finalCost[0] = cost[0];
        finalCost[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            finalCost[i] = cost[i - 1] + Math.min(finalCost[i - 1],finalCost[i - 2]);
        }
        return Math.min(finalCost[cost.length - 1],finalCost[cost.length - 2]);
    }

    public static void main(String[] args) {
        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
        int[] cost = {0, 0, 1};
        System.out.println(mccs.minCostClimbingStairs(cost));
    }
}
