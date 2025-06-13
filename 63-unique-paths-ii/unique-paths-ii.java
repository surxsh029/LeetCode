public class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // If starting cell has obstacle, no path
        if (grid[0][0] == 1) return 0;

        dp[0][0] = 1;

        // Fill the first column
        for (int i = 1; i < m; i++) {
            if (grid[i][0] == 0) dp[i][0] = dp[i - 1][0];
        }

        // Fill the first row
        for (int j = 1; j < n; j++) {
            if (grid[0][j] == 0) dp[0][j] = dp[0][j - 1];
        }

        // Fill the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
