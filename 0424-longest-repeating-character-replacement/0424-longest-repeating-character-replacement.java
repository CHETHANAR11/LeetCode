class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int max=0;
        int maxValueCount=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxValueCount=Math.max(hm.get(ch),maxValueCount);
            while(j-i+1-maxValueCount>k){
               char ch1=s.charAt(i);
                hm.put(ch1,hm.getOrDefault(ch1,0)-1);
                i++;
            }
              max=Math.max(j-i+1,max);
              j++;
        }
        return max;
    }
}