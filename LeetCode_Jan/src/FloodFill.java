//0120
//733. Flood Fill


// flood fill on the image starting from the pixel image[sr][sc].

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    //BFS / DFS: -> 200 Number of Islands
    //find the island and paint the new color

    //BFS
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int m = image.length, n = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited =  new boolean[m][n]; //null, if visited then true

        q.offer(new int[]{sr, sc});
        visited[sr][sc] = true;
        if (image[sr][sc] == newColor) return image; //no need to change

        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;

        int[][] neighbors = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] nb: neighbors) {
                int r = cur[0] + nb[0];
                int c = cur[1] + nb[1];
                if (r < 0 || c < 0 || r >= m || c >= n || visited[r][c]) continue;
                visited[r][c] = true;
                if (image[r][c] == oldColor) {
                    q.offer(new int[] {r, c});
                    image[r][c] = newColor;
                }
            }
        }
        return image;

    }

    //DFS
    public int[][] floodFillDFS(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;
        helpDFS(image, sr, sc, oldColor, newColor);
        return image;
    }
    private void helpDFS(int[][] image, int r, int c, int oldColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oldColor) return;

        image[r][c] = newColor;

        int[][] neighbors = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int[] n : neighbors) {
            int curR = r + n[0];
            int curC = c + n[1];
            helpDFS(image, curR, curC, oldColor, newColor);
        }
    }

}
