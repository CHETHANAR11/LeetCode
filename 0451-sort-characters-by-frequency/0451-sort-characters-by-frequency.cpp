class Solution {
public:
    string frequencySort(string s) {
        vector<pair<int,char>> hash('z'+1,{0,0});
        
        for(char ch:s){
            hash[ch]= {hash[ch].first+1,ch};
        }
        
        sort(hash.begin(),hash.end());
        
        string res="";
        
        for(auto p:hash)
            res= string(p.first,p.second)+res;
        
        return res;
    }
};