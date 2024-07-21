class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        boolean[] visited=new boolean[n];
         for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }  
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return dfs(graph,visited,source,destination);
    }
    public boolean dfs(List<List<Integer>>graph,boolean[] vis,int curr,int end){
        if(curr==end){
            return true;
        }
        else if(vis[curr]==true){
            return false;
        }
        vis[curr]=true;
        for(int n:graph.get(curr)){
            if(dfs(graph,vis,n,end)){
                return true;
            }
        }
        return false;
    }
}