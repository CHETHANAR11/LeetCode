class Solution {
public:
    int partitionString(string s) {
        set<char> se;
        int j = 0 , cnt = 0;
        for(int i = 0 ; i < s.size() ; i++){
            while(i < s.size() && se.find(s[i]) == se.end()){
                se.insert(s[i]);
                i++;
            }
            i--;
            cnt++;
            se.clear();
        }
        return cnt;
    }
};