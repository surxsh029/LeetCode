class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i > 0 && mat[i][j] <= mat[i - 1][j]) continue;
                if (i < rows - 1 && mat[i][j] <= mat[i + 1][j]) continue;
                if (j > 0 && mat[i][j] <= mat[i][j - 1]) continue;
                if (j < cols - 1 && mat[i][j] <= mat[i][j + 1]) continue;
                return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }
}

