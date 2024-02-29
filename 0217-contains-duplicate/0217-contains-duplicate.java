class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>  hp= new HashMap<>();
        for(int i :nums){
            hp.put(i,hp.getOrDefault(i,0)+1);
            if(hp.get(i)>1)
                return true;
        }
        return false;
    }
}