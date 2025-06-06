class Solution {

    public static boolean isSafe(char board[][],int row, int col){
        // vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }

        // right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;

    }
    public static void findQueen(char board[][],int row,List<List<String>>result){
        if(row==board.length){
            List<String> list = new ArrayList<>();
          for (int i = 0; i < board.length; i++) {
                list.add(new String(board[i]));
            }
            result.add(list);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                findQueen(board,row+1,result);
                board[row][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][] board=new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        findQueen(board,0,result);
        return result;
    }
}