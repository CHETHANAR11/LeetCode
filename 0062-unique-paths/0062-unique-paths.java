import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i=0;i<m;i++){
                dp[i][n-1]=1;
            }
        
        for(int j=0;j<n;j++){
            dp[m-1][j]=1;
        }
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        // return res(m-1,n-1,dp);
    }
    // public int res(int m, int n, int[][] dp) {
    //     if (m == 0 || n == 0) {
    //         return 1;
    //     }
    //     if (dp[m][n] != -1) {
    //         return dp[m][n];
    //     }
    //     int up = res(m - 1, n, dp);
    //     int left = res(m, n - 1, dp);
    //     return dp[m][n] = up + left;
    // }
}
