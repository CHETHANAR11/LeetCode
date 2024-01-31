class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        map<int,int> l;
        vector<int> zero;
        vector<int> ones;
        for (auto m : matches)
        {
            if (!l.count(m[0])) l[m[0]] = 0;
            l[m[1]]++;
        }
        for (auto[k,l] : l)
        {
            if (l == 0) 
                zero.push_back(k);
            if (l == 1)
                ones.push_back(k);
        }
        return {zero,ones};
    }
};