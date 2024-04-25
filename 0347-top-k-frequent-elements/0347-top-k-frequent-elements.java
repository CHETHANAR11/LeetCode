class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final int n= nums.length;
        int[] ans=new int[k];
        Map<Integer,Integer> count= new HashMap<>();
        Queue<T> minHeap = new PriorityQueue<>((a,b)->a.fr-b.fr);
        
        for(final int num:nums){
            count.merge(num,1,Integer::sum);
        }
        
        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            final int num=entry.getKey();
            final int fr=entry.getValue();
            minHeap.offer(new T(num,fr));
            if(minHeap.size()>k){
                minHeap.poll();
            }
            
        }
        for(int i=0;i<k;++i){
            ans[i]=minHeap.poll().num;
        }
        return ans;
    }
}

class T{
    public int num;
    public int fr;
    public T(int num,int fr){
        this.num=num;
        this.fr=fr;
    }
}