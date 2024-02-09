class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int maxcol=matrix[0].length-1;
        int maxrow=matrix.length-1;
        int minrow=0,mincol=0;
        int t=(maxrow+1)*(maxcol+1);
        int cnt=0;
        while(cnt<t){
            for(int r=minrow,c=mincol;c<=maxcol&& t>cnt;c++,cnt++){
                ans.add(matrix[r][c]);
            }
            minrow++;
            for(int c=maxcol,r=minrow;r<=maxrow&& t>cnt;r++, cnt++){
                ans.add(matrix[r][c]);
            }
            maxcol--;
            for(int r=maxrow,c=maxcol;c>=mincol&& t>cnt;c--,cnt++){
                ans.add(matrix[r][c]);
            }
             maxrow--;
            for(int r=maxrow,c=mincol;r>=minrow&& t>cnt;r--,cnt++){
                ans.add(matrix[r][c]);
            }
            mincol++;
           
        }
      return ans;
    }
}