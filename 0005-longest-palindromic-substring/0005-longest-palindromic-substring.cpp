class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size();
        int start = 0;
        int longlen = 1; 
        
        vector<vector<bool>> t(n, vector<bool>(n, false));
        
        for (int i = 0; i < n; i++)
            t[i][i] = true;
        
        for (int i = 0; i < n - 1; i++) 
        {
            if (s[i] == s[i + 1])
            {
                t[i][i+1] = true;
                start = i;
                longlen = 2;
            }
        }
        
        for (int l = 3; l <= n; l++) 
        {
            for (int i = 0; i < n - l + 1; i++) 
            {
                int j = i + l - 1; 
                if (s[i] == s[j] && t[i + 1][j - 1]) 
                {
                    t[i][j] = true;
                    if (l > longlen) 
                    {
                        longlen = l;
                        start = i;
                    }
                }
            }
        }
        
        return s.substr(start, longlen);
    }
};