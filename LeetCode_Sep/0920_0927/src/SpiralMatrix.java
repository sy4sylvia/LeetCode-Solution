//0926 - 0927
//59 Spiral Matrix II

public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int val = 1;
        if(n == 1) {
            result[0][0] = 1;
        }
        else {
            int left = 0, top = 0, right = n - 1, bottom = n - 1;
            while(left < n && top < n && right > 0 && bottom > 0) {
                for(int i = left; i <= right; i++) {
                    result[top][i] = val++;
                }
                for(int j = top + 1; j <= bottom; j++) {
                    result[j][right] = val++;
                }
                if(bottom != top) {
                    for(int p = right - 1; p >= left; p--) {
                        result[bottom][p] = val++;
                    }
                }
                if(left != right) {
                    for(int q = bottom - 1; q > top; q--) {
                        result[q][left] = val++;
                    }
                }
                left++;
                top++;
                right--;
                bottom--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] res = sm.generateMatrix(2);
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
