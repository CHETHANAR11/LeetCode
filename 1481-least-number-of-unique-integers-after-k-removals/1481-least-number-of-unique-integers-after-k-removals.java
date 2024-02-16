class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> m= new HashMap<>();
        
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        
        int[] freq= new int[m.size()];
        int index=0;
        for(int v:m.values()){
            freq[index++]=v;
        }
        
        Arrays.sort(freq);
        
        int uniqu=freq.length;
        for(int f:freq){
            if(k>=f){
                k-=f;
                uniqu--;
            }
            else{
                break;
            }
        }
            
       return uniqu;
    }
}