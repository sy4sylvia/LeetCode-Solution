import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBFS {

    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (rooms[r][c] == 0) {
                    visited[r][c] = true;
                    q.offer(new int[]{r, c}); //add multiple scrs to the q
                }
                else visited[r][c] = false;
            }
        }

        if (q.isEmpty()) return; //no gates, no modifying

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] dir : dirs) {
                int row = cur[0] + dir[0];
                int col = cur[1] + dir[1];
                if (row < 0 || row >= m || col < 0 || col >= n) continue;
                if (!visited[row][col]) {
                    visited[row][col] = true; // visited
                    if (rooms[row][col] == 2147483647) {
                        q.offer(new int[] {row, col});
                        rooms[row][col] = rooms[cur[0]][cur[1]] + 1;
                    }
                }
            }
        }
    }

    //752. Open the Lock

    //use DFS and search for the target, then compare to get the shortest path, likely to get TLE
    //use BFS, stop at the level where the target is, no more search afterwards
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        HashSet<String> unreachable = new HashSet<>();
        for (String dead : deadends) unreachable.add(dead);
        q.offer("0000");
        visited.add("0000");

        int depth = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                String cur = q.poll();
                if (unreachable.contains(cur)) {
                    size--;
                    continue;
                }
                if (cur.equals(target)) return depth;

                char[] fourDigits = cur.toCharArray();

                for (int i = 0; i < 4; i++) {
                    int curNum1 = (fourDigits[i] == '9') ? 0 : (fourDigits[i] - '0' + 1);
                    int curNum2 = fourDigits[i] == '0' ? 9 : (fourDigits[i] - '0' - 1);

                    String tmp1 = cur.substring(0, i) + curNum1 + (cur.substring(i + 1)); //begin index
                    String tmp2 = cur.substring(0, i)+ curNum2 + (cur.substring(i + 1));

                    if (!visited.contains(tmp1) && !unreachable.contains(tmp1)) {
                        q.offer(tmp1);
                        visited.add(tmp1);
                    }
                    if (!visited.contains(tmp2) && !unreachable.contains(tmp2)) {
                        q.offer(tmp2);
                        visited.add(tmp2);
                    }
                }
                size--;
            }
            depth++;
        }
        return -1;
    }

    public static void main(String[] args) {
        QueueBFS bfs = new QueueBFS();

        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        System.out.println(bfs.openLock(deadends, target));
    }

}
