class Solution {
    public int[][] dir={{-1,0},{0,-1},{0,1},{1,0}};
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int isl=0;
        boolean[][] visited =new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{i,j});
                    island(grid,q,visited);
                    isl+=1;
                }
                else{
                    visited[i][j]=true;
                }
            }
        } 
        return isl;  
    }
    public void island(char[][] grid,Queue<int[]> q,boolean[][] visited){
        while(q.size()>0){
            int[]point=q.poll();
            for(int[] d:dir){
                int x=d[0]+point[0];
                int y=d[1]+point[1];
                if(x>=0 && x<grid.length && y>=0 &&y<grid[0].length &&grid[x][y]=='1'){
                    if(visited[x][y]==true){
                        continue;
                    }
                    visited[x][y]=true;
                    q.add(new int[]{x,y});
                }
            }
        }
        
    }
}