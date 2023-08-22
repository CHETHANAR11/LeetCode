class Solution {
public:
    string removeOuterParentheses(string s) {
        
        string result;
        int open=0;
        
        for(char ch: s){
            if(ch=='(' && open++>0) result+=ch;
            if(ch==')' && open-->1) result+=ch;
        }
        
        return result;
    }
};