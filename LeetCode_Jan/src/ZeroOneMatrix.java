//0120
//542. 01 Matrix

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        //check the neighbors and search for nearest 0

        //BFS -> Walls and Gates
        int m = mat.length, n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        //treat all zeroes as sources

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) visited[i][j] = false; //initialization, haven't been visited
                else {
                    visited[i][j] = true;
                    q.offer(new int[]{i, j}); //mark all sources as visited
                }
            }
        }

        if (q.isEmpty()) return mat;

        int[][] neighbors = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        while (!q.isEmpty()) {
            for (int[] nb : neighbors) {
                int[] cur = q.poll();
                int row = cur[0] + nb[0];
                int col = cur[1] + nb[1];
                if (row < 0 || row >= m || col < 0 || col >= n || visited[row][col]) continue;
                visited[row][col] = true;
                q.offer(new int[]{row, col});
                mat[row][col] = mat[cur[0]][cur[1]] + 1;
            }
        }
        return mat;
    }
}
