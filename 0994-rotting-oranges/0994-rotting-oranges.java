class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        Queue<int[]> qu=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        int min=0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             if(grid[i][j]==1){
                 fresh++;
             }   
            else if(grid[i][j]==2){
                qu.add(new int[]{i,j});
            }
            }
        }
        
        if(fresh==0){
            return 0;
        }
        
        int[][] direc= {{-1,0},{1,0},{0,-1},{0,1}};
        
        while(!qu.isEmpty()){
            int size=qu.size();
            boolean rotted=false;
            for(int k=0;k<size;k++){
                int[] point=qu.poll();
                for(int[] d:direc){
                    int x=point[0]+d[0];
                    int y=point[1]+d[1];
                    
                    if(x>=0 && x<row && y>=0 &&y<col && grid[x][y]==1){
                        grid[x][y]=2;
                        fresh--;
                        qu.add(new int[]{x,y});
                        rotted=true;
                    }
                }
            }
            if(rotted)
            min++;
        }
        
        return fresh == 0 ? min : -1;
        
    }
}