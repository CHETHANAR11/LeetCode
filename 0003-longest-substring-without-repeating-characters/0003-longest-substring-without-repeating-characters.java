import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start=0,end=0,count=0,len=0;
        int n = s.length();
       int[] freq = new int[128];
       while(end<n){
           char ch=s.charAt(end);
           if(freq[ch]==1){
               count++;
           }
           freq[ch]++;
           end++;
           while(count>0){
               char charS=s.charAt(start);
               if(freq[charS]==2)
                   count--;
               freq[charS]--;
               start++;
           }
           len=Math.max(len,end-start);
       }
        return len;
    }
}




