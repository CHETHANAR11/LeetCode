class Solution {
public:
    int compress(vector<char>& chars) {
        if (chars.empty()) {
            return 0;
        }

        string ans;
        int tmp = 1; 
        char tmp2 = chars[0]; 

        for (int i = 1; i < chars.size(); i++) {
            if (chars[i] == tmp2) {
                tmp++;
            } else {
                ans += tmp2;
                if (tmp > 1) {
                    ans += to_string(tmp);
                }
                tmp2 = chars[i];
                tmp = 1;
            }
        }

        ans += tmp2;
        if (tmp > 1) {
            ans += to_string(tmp);
        }

        chars.clear();
        for (auto i : ans) {
            chars.push_back(i);
        }

        return chars.size();
    }
};
