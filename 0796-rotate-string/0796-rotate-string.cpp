class Solution {
public:
    bool rotateString(string s, string goal) {
        queue<char> s1,s2;
        if(s==goal)return true;
        for(int i=0;i<s.size();i++){
            s1.push(s[i]);
        }
         for(int i=0;i<goal.size();i++){
            s2.push(goal[i]);
        }
        int k= goal.size()-1;
        while(k!=0){
            char ch= s2.front();
            s2.pop();
            s2.push(ch);
            
            if(s1==s2){
                return true;
            }
            k--;
        }
        return false;
    }
};