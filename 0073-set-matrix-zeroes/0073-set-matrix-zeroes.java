class Solution {
    class pair
    {
        int i;
        int j;
        pair(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public void helper_row(int [][]matrix,int x)
    {
        for(int col=0;col<matrix[0].length;col++)
        {
            matrix[x][col]=0;
        }
    }
    public void helper_col(int [][]matrix,int y)
    {
        for(int row=0;row<matrix.length;row++)
        {
            matrix[row][y]=0;
        }
    }
    public void setZeroes(int[][] matrix) 
    {
        ArrayList<pair>al=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    pair p=new pair(i,j);
                    al.add(p);
                }
            }
        }    
        for(int i=0;i<al.size();i++)
        {
            pair p=al.get(i);
            helper_row(matrix,p.i);
            helper_col(matrix,p.j);
        }
        
    }
}