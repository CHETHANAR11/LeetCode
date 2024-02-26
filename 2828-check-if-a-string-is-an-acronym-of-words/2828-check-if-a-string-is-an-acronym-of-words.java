class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb= new StringBuilder();
        if(words.size()!=s.length())return false;
        for(String w:words){
            sb.append(w.charAt(0));
        }
        String sbb= sb.toString();
        if(sbb.equals(s))
            return true;
        else
            return false;
    }
}