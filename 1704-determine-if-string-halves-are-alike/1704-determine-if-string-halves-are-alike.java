class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int l=(s.length())/2;
        char[] str = s.toCharArray();
        int count1=0;
        int count2=0;
       for(int i=0;i<l;i++)
         {
             if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
             {
                 count1++;
             }
         }
        for(int i=l;i<s.length();i++){
             if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
             {
                 count2++;
             }
        }
        
        if(count1==count2){
            return true;
        }
        else
            return false;
    }
    
}