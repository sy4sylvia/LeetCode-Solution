//54 Spiral Matrix I
//0926 - 0927

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrixI {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, top = 0, right = n - 1, bottom = m - 1;
        while (result.size() < m * n) {
            for(int i = left; i <= right; i++) result.add(matrix[top][i]);
            for(int j = top + 1; j <= bottom; j++) result.add(matrix[j][right]);
            if(bottom != top) {
                for(int p = right - 1; p >= left; p--) result.add(matrix[bottom][p]);
            }
            if(left != right) {
                for(int q = bottom - 1; q > top; q--) result.add(matrix[q][left]);
            }
            left++;
            top++;
            right--;
            bottom--;
        }

//        for(int i = 0; i < m; i++) {
//            if(i / 2 == 0) {
//                for(int j = 0; j < n; j++) {
//                    matrix[i][j] = i * 4 + j;
//                    result.add(matrix[i][j]);
//                }
//            }
//            else {
//                for(int j = n - 1; j >= 0 ; j--) {
//                    matrix[i][j] = i * 4 + j;
//                    result.add(matrix[i][j]);
//                }
//            }
//        }

        return result;
    }

    public static void main(String[] args) {

    }
}
