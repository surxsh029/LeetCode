class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidInitialBoard(board);
    }

    public static boolean isValidInitialBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char digit = board[i][j];
                if (digit != '.') {
                    board[i][j] = '.'; // Temporarily empty to check validity
                    if (!isSafe(board, i, j, digit)) {
                        return false;
                    }
                    board[i][j] = digit; // Restore value
                }
            }
        }
        return true;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}
    