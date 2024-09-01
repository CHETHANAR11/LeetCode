// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int y=1,n=matrix.length,m=matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]<target){
//                     continue;
//                 }
//                 if(y==0 &&matrix[i][j]>target){
//                     i--;
//                 }
//                 else{
//                     i++;
//                     y=0;
//                 }
//                 if(matrix[i][j]==target){
//                     return false;
//                 }
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) return false;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;  
            } else {
                row++;  
            }
        }

        return false; 
    }
}