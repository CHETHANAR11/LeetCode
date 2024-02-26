class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] ss= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer>mp = new HashMap<>();
       for(String w: words){
           StringBuilder sb=new StringBuilder();
           for(char c:w.toCharArray()){
               int i=c-'a';
               sb.append(ss[i]);
           }
           String sbb= sb.toString();
          mp.put(sbb, mp.getOrDefault(sbb, 0) + 1);
           System.out.println(mp);
           
       } 
        return mp.size();
    }
}