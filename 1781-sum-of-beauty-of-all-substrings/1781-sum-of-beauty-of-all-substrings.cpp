class Solution {
public:
    int beautySum(string s) {
        int n = s.size();
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            vector<int> freq(26, 0);

            for (int j = i; j < n; ++j) {
                ++freq[s[j] - 'a'];

                int maxFreq = *max_element(freq.begin(), freq.end());
                int minFreq = INT_MAX; 
                
                for (int k = 0; k < 26; ++k) {
                    if (freq[k] > 0) {
                        minFreq = min(minFreq, freq[k]);
                    }
                }
                
                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
};
