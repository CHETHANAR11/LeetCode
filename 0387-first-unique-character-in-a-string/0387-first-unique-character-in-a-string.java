class Solution {
    public int firstUniqChar(String s) {
        int c=0;
        //int a=Integer.parseInt(str);
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == i && s.lastIndexOf(s.charAt(i)) == i){
                return i;
            }
        }
        return -1;
    }
}