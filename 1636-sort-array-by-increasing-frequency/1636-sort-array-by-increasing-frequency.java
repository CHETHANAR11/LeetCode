class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int[] ans=new int[nums.length];
      
        List<Map.Entry<Integer,Integer>> li=new ArrayList<>(hm.entrySet());
        li.sort((a,b)->{
            if(a.getValue()!=b.getValue()){
                return a.getValue()-b.getValue();
            }
            else{
                return b.getKey()-a.getKey();
            }
        });
            int in=0;
            for(Map.Entry<Integer,Integer> l:li){
                int k=l.getKey();
                int v=l.getValue();
                for(int i=0;i<v;i++){
                    ans[in++]=k;
                }
            }
        return ans;
    }
}