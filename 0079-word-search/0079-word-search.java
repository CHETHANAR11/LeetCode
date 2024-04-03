class Solution {
    private int row, col;
    private Set<String> path;

    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        path = new HashSet<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int r, int c, int i, String word) {
        if (i == word.length()) {
            return true;
        }
        if (r < 0 || c < 0 || r >= row || c >= col || word.charAt(i) != board[r][c] || path.contains(r + "," + c)) {
            return false;
        }
        path.add(r + "," + c);
        boolean res = (dfs(board, r + 1, c, i + 1, word) ||
                       dfs(board, r - 1, c, i + 1, word) ||
                       dfs(board, r, c + 1, i + 1, word) ||
                       dfs(board, r, c - 1, i + 1, word));
        path.remove(r + "," + c);
        return res;
    }
}
