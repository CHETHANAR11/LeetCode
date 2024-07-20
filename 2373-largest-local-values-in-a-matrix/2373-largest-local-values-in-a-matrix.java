// class Solution {
//     public int[][] largestLocal(int[][] grid) {
//         int r=grid.length;
//         int c=grid[0].length;
//         int[][] maxLocal=new int[r-2][r-2];
//         int n=0,m=0;
//         while(true){
//             int max=0;
//             for(int i=0;i<i+3 &&i!=r;i++){
//                for(int j=sj;j<j+3&&j!=c;j++){
//                    if(max<grid[i][j]){
//                        max=grid[i][j];
//                    }
//                 }
//          }
//             maxLocal[n][m]=max;
//             if(m<r-3){
//                 m++;
//             }
//             else if(n<r-3){
//                 n++;
//                 m=0;
//             }
//             else if(n==r-2||m==n-2){
//                 break;
//             }
//         }
//         return maxLocal;
//     }
// }

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];
        System.out.println(n);
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (grid[x][y] > max) {
                            max = grid[x][y];
                        }
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}
