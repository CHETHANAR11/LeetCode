class Solution {
    public char shift(char ch,int n){
        return (char)(ch+n);
    }
    public String replaceDigits(String s) {
        StringBuffer sb = new StringBuffer();
        char[] ch=s.toCharArray();
        int len=ch.length;
        for(int i=0;i<len;i++){
            if(ch[i]>='0' && ch[i]<='9'){
            int n=ch[i]-'0';
            sb.append(shift(ch[i-1],n));}
            else
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}


