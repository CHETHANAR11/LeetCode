class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        Stack<Integer> st=new Stack<>();
        for(int i =0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                st.push(i);
            }
        }
        return new ArrayList<>(st);
    }
}