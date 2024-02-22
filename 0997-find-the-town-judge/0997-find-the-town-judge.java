class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree=new int[n+1];
        Arrays.fill(indegree,0);
         int[] outdegree=new int[n+1];
        Arrays.fill(outdegree,0);
        
        for(int i=0;i<trust.length;i++){
            indegree[trust[i][1]]++;
            outdegree[trust[i][0]]++;
        }
        
        int o=-1;
        int count=0;
        for(int i=1;i<=n;i++){
            if(indegree[i]==trust.length ||indegree[i]==n-1 && outdegree[i]==0){
                count++;
                o=i;
            }
        }
        if(count==1){
            return o;
        }
        return -1;
    }
}