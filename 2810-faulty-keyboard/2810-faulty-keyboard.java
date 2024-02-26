class Solution {
    public String finalString(String s) {
        
     StringBuilder sb=new StringBuilder();
     for(char i:s.toCharArray()){
         if(i != 'i'){
             sb.append(i);
         }
         else{
             sb.reverse();
         }
     }
        String sbb=sb.toString();
        return sbb;
    }
}