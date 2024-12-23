class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int l=nums.length;
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> li=new ArrayList<>();
        boolean[] b=new boolean[l];
        per(l,nums,b,sub,li);
        return li;
    }
    public void per(int l,int[] nums,boolean[] b,List<Integer> sub,List<List<Integer>> li){
        if(sub.size()==l){
            li.add(new ArrayList<>(sub));
            return;
        }
        if(sub.size()>l){
            return;
        }
        for(int i=0;i<l;i++){
            if(b[i]==false){
                sub.add(nums[i]);
                b[i]=true;
                per(l,nums,b,sub,li);
                sub.remove(sub.size()-1);
                b[i]=false;
            }
        }
    }
   
}