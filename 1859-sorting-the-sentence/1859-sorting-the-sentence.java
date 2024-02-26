class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> mp=new HashMap<>();
        for(String word :s.split(" ")){
            int lasti=word.length()-1;
            int num=word.charAt(lasti)-'0';
            String aword=word.substring(0,lasti);
            mp.put(num,aword);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,String> m:mp.entrySet()){
            sb.append(m.getValue());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}