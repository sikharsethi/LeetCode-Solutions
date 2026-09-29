class Solution {
    private int m, n;
    private char[][] grid;
    private Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;
        
        // Total path steps must be even
        if ((m + n - 1) % 2 != 0) {
            return false;
        }
        
        // The maximum possible balance is bounded by the total steps (m + n)
        this.memo = new Boolean[m][n][m + n];
        
        return dfs(0, 0, 0);
    }

    private boolean dfs(int r, int c, int balance) {
        // Accumulate balance
        balance += (grid[r][c] == '(') ? 1 : -1;
        
        // Prune path if it drops below 0 or exceeds remaining capacity
        if (balance < 0 || balance > (m - r + n - c)) {
            return false;
        }
        
        // Base case: Reached bottom-right corner
        if (r == m - 1 && c == n - 1) {
            return balance == 0;
        }
        
        // Return cached value if already evaluated
        if (memo[r][c][balance] != null) {
            return memo[r][c][balance];
        }
        
        boolean found = false;
        // Move Down
        if (r + 1 < m) {
            found = found || dfs(r + 1, c, balance);
        }
        // Move Right
        if (c + 1 < n) {
            found = found || dfs(r, c + 1, balance);
        }
        
        return memo[r][c][balance] = found;
    }
}
