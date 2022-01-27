//0123

import java.util.ArrayList;
import java.util.Arrays;

public class SearchArray {
    //74. Search a 2D Matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        //1 <= m, n <= 100
        //convert into 1D array, already sorted
        int m = matrix.length, n = matrix[0].length;
        int[] arr = new int[m * n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) arr[idx++] = matrix[i][j];
        }
        //binary search
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) left = mid + 1;
            if (arr[mid] == target) return true;
            if (arr[mid] > target) right = mid - 1;
        }
        return false;

    }


//    240. Search a 2D Matrix II

    private int[][] matrix;
    private int target;

    public boolean searchMatrix2(int[][] matrix, int target) {
        //1 <= m, n <= 300
        this.matrix = matrix;
        this.target = target;
        return helperSearch(0, 0, matrix[0].length - 1, matrix.length - 1);
    }
    private boolean helperSearch(int left ,int up, int right, int down) {
        //base case: empty matrix / smallest in the matrix > target / largest in the matrix < target
        if (left > right || up > down) return false;
        else if (target < matrix[up][left] || target > matrix[down][right]) return false;

        int mid = left + (right - left) / 2;
        int row = up;
        while (row <= down && matrix[row][mid] <= target) {
            if (matrix[row][mid] == target) return true;
            row++;
        }
        //bottom-left and top-right submatrice
        return helperSearch(left, row, mid - 1, down) || helperSearch(mid + 1, up, right, row - 1);
    }

    public static void main(String[] args) {
        SearchArray sa = new SearchArray();
        int[][] matrix = {{1, 3, 5, 7}, {23, 30, 34, 60}};
        System.out.println(sa.searchMatrix(matrix, 3));
    }
}
