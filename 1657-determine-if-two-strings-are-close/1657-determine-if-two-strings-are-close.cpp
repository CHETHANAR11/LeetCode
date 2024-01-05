class Solution {
public:
    bool closeStrings(string word1, string word2) {
        vector<int> vec1(26,0),vec2(26,0),v1(26,0),v2(26,0);
        
        for(auto a:word1)vec1[a-'a']++,v1[a-'a']=1;
        for(auto a:word2)vec2[a-'a']++,v2[a-'a']=1;
        sort(vec1.begin(),vec1.end());
        sort(vec2.begin(),vec2.end());
        return vec1==vec2&&v1==v2;
    }
};