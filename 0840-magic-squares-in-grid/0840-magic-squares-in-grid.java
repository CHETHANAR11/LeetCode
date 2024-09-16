class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        
        for (int x = 0; x + 2 < n; x++) {
            for (int y = 0; y + 2 < m; y++) {
                if (isMagic(grid, x, y)) {
                    ans++;
                }
            }
        }
        
        return ans;
    }

    private boolean isMagic(int[][] grid, int x, int y) {
        // Check distinct values 1-9
        boolean[] seen = new boolean[10];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                int val = grid[i][j];
                if (val < 1 || val > 9 || seen[val]) {
                    return false;
                }
                seen[val] = true;
            }
        }

        // Check rows, columns, and diagonals for equal sums
        int sum = grid[x][y] + grid[x][y+1] + grid[x][y+2];
        
        for (int i = 0; i < 3; i++) {
            if (grid[x+i][y] + grid[x+i][y+1] + grid[x+i][y+2] != sum) return false;
            if (grid[x][y+i] + grid[x+1][y+i] + grid[x+2][y+i] != sum) return false;
        }
        
        if (grid[x][y] + grid[x+1][y+1] + grid[x+2][y+2] != sum) return false;
        if (grid[x][y+2] + grid[x+1][y+1] + grid[x+2][y] != sum) return false;

        return true;
    }
}
