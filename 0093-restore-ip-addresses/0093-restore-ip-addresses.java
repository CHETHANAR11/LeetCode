class Solution {
    List<String> res=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        int l=s.length();
        if(l<4 || l>12){
            return res;
        }
        backtrack(0,0,"",s);
        return res;
    }
    public void backtrack(int i,int dot,String currIp,String s){
        if(dot==4 && i==s.length()){
            res.add(currIp.substring(0,currIp.length()-1));
            return;
        }
        if(dot>=4){
            return;
        }
        for(int j=i;j<Math.min(i+3,s.length());j++){
            String sub=s.substring(i,j+1);
            if(valid(sub)){
                backtrack(j+1,dot+1,currIp+sub+".",s);
            }
        }
    }
    public boolean valid(String sub){
        if(sub.length()>4 ){
            return false;
        }
        if(sub.charAt(0)=='0' && sub.length()>1){
            return false;
        }
        int num=Integer.parseInt(sub);
        return num<=255 && num>=0;
    }
}