class Solution {
public:
    int longestValidParentheses(string s) {
        stack<int> stk;
        stk.push(-1);
        int cnt=0;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='(')
            stk.push(i);
            else {
                stk.pop();
                if(stk.empty())
                stk.push(i);
                else
                cnt=max(cnt,i-stk.top());
            }

        }
        return cnt;
    }
};