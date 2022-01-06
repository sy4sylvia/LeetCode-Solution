//0102
//997 Find the Town Judge

import java.util.ArrayList;
import java.util.List;

public class TownJudge {


    public int findJudge(int n, int[][] trust) {
        //di-garph, in-degree = 0, out-degree = n - 1;
        //trust[0].length = 2;

        int[] outDegree = new int[n + 1], inDegree = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            outDegree[trust[i][1]]++; //{1, 3}, outDegree[3]++, 1 <- 3
            inDegree[trust[i][0]]++; //inDegree[1]++, 1 <- 3
        }
        for (int i = 1; i <= n; i++) {
            if (outDegree[i] == (n - 1) && inDegree[i] == 0) return i;
        }
        return -1;
    }


//    private void helperGraph(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
//        adjList.get(u).add(v);
//    }

    public static void main(String[] args) {
        TownJudge tj = new TownJudge();
        int n = 1;
        int[][] trust = {};
        System.out.println(tj.findJudge(n, trust));
    }
}
