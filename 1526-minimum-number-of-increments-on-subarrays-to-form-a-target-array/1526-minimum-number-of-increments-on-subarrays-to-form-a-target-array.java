class Solution {
    public int minNumberOperations(int[] target) {
        int cnt=0;
        int prev=0;
        for(int i=0;i<target.length;i++){
            if(target[i]>prev){
                cnt+=(target[i]-prev);
            }
            prev=target[i];
        }
        return cnt;
    }
}