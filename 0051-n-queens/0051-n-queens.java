class Solution {
   public void saveboard(char[][] board, List<List<String>> allBoards) {
    List<String> newBoard = new ArrayList<>();

    for (int i = 0; i < board.length; i++) {
        StringBuilder row = new StringBuilder();
        for (int j = 0; j < board[0].length; j++) {
            row.append(board[i][j] == 'Q' ? 'Q' : '.');
        }
        newBoard.add(row.toString());
    }

    allBoards.add(newBoard);
}


    public boolean safe(int row, int col, char[][] board) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveboard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (safe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }
}
