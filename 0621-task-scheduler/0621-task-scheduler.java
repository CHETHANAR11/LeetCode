class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:tasks){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int count:hm.values()){
            pq.add(count);
        }
        Queue<int[]> q=new LinkedList<>();
        int time=0;
        
        while(!pq.isEmpty()||!q.isEmpty()){
            time++;
            if(!q.isEmpty() && q.peek()[1]==time){
             pq.add(q.poll()[0]);
            }
            if(!pq.isEmpty()){
                int remain=pq.poll()-1;
                if(remain>0){
                    q.add(new int[]{remain,time+n+1});
                }
            }
        }
        return time;
    }
}