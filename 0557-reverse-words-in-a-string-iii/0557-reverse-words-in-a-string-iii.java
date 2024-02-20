class Solution {
    public String reverseWords(String s) {
        String [] ss=s.split(" ");
        Stack<String> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(String w :ss){
            ans.append(reverseString(w)).append(" ");
        }
        return ans.toString().trim();
    }
    public String reverseString(String s){
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            st.push(c);
        }
        StringBuilder rev= new StringBuilder();
        while(!st.isEmpty()){
            rev.append(st.pop());
       
        }
         return rev.toString();
    }
}