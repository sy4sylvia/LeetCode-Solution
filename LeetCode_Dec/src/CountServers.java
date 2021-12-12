//1209
//1267 Count Servers that Communicate

import java.util.LinkedList;
import java.util.Queue;

public class CountServers {
    public int countServers(int[][] grid) {
        int rowNum = grid.length;
        int colNum = grid[0].length;

        int rowCount[] = new int[rowNum];
        int colCount[] = new int[colNum];

        int serverNum = 0;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++; //not so easy to come up with such solution
                    colCount[j]++;
                    serverNum++;
                }
            }
        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    serverNum--; //remove duplicate
                }
            }
        }
        return serverNum;
    }

    public static void main(String[] args) {
        CountServers cs = new CountServers();
        int[][] grid = {{0, 0, 1, 1},{1, 0, 1, 1}};
        System.out.println(cs.countServers(grid));
    }

}
