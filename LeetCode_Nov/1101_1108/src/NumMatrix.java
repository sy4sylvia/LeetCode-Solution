//1118
//304 Range Sum Query 2D - Immutable


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

class NumMatrix {

    private int[][] auxSum;

    public NumMatrix(int[][] matrix) {
        auxSum = new int[matrix.length + 1][matrix[0].length + 1];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                auxSum[row + 1][col + 1] = auxSum[row][col + 1] + auxSum[row + 1][col] - auxSum[row][col] + matrix[row][col];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return auxSum[row2 + 1][col2 + 1] - auxSum[row1][col2 + 1] - auxSum[row2 + 1][col1] + auxSum[row1][col1];
    }

    public static void main(String[] args) {

        int[][] m = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix nm = new NumMatrix(m);
        System.out.println(nm.sumRegion(2, 1,4, 3 ));
    }
}
