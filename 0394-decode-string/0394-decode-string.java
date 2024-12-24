class Solution {
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            
            if(Character.isDigit(s.charAt(i))){
               // int num=s.charAt(i).toNumber();
                int num = 0;
                // Read the full number
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i++;
                int st=i;
                int o=1;
                while(o>0){
                    i++;
                    if(s.charAt(i)=='[')o++;
                    if(s.charAt(i)==']')o--;
                }
                String rep=s.substring(st,i);
                String de=decodeString(rep);
                while(num-->0){
                sb.append(de);
            }
            }
            else{
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }
}