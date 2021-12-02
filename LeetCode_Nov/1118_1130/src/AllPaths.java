//1128
//797. All Paths From Source to Target

import java.util.ArrayList;
import java.util.List;

public class AllPaths {
//    private int target;
//    private int[][] graph;
//    private List<List<Integer>> ans;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<Integer> subL = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
        subL.add(0);
        helperDFS(0, graph, subL, l);
        return l;
//        if (graph.length == 2) {
//            subL.add(1);
//            l.add(subL);
//            return l;
//        }
//
//        for (int i = 0; i < graph.length; i++) {
//            List<Integer> subL2 = new ArrayList<>();
//            subL.add(i);
//            for (int j = 0; j < graph[i].length; j++) {
//                subL.add(graph[i][j]);
//            }
//            l.add(subL);
//        }
//        return l;
    }
    private void helperDFS(int node, int[][] graph, List<Integer> path, List<List<Integer>> l) {
        if (node == graph.length - 1) {
            l.add(new ArrayList<>(path));
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            helperDFS(nextNode, graph, path, l);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        AllPaths ap = new AllPaths();
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        System.out.println(ap.allPathsSourceTarget(graph));
    }
}
