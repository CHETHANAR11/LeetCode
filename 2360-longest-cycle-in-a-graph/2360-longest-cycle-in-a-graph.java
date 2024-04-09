class Solution {
    int ans=-1;
    void dfs(int node,int[] edges,Map<Integer,Integer> dist,boolean[] vis){
        vis[node]=true;
        int nei=edges[node];
        
        if(nei!=-1 && !vis[nei]){
            dist.put(nei,dist.get(node)+1);
            dfs(nei,edges,dist,vis);
        }
        else if(nei!=-1 && dist.containsKey(nei)){
            ans=Math.max(ans,dist.get(node)-dist.get(nei)+1);
        }
    }
    public int longestCycle(int[] edges) {
        int n= edges.length;
        boolean[] vis=new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
                Map<Integer,Integer> dist=new HashMap<>();
                dist.put(i,1);
                dfs(i,edges,dist,vis);
            }
        }
        return ans;
    }
}