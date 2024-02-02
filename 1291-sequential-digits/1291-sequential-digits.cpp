class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        string num="123456789";
        vector<int> res;
        int ll=to_string(low).length();
        int hl=to_string(high).length();
        for(int i=ll;i<=hl;++i){
            for(int j=0;j<10-i;++j){
                int n=stoi(num.substr(j,i));
                if(n>=low && n<=high)
                    res.push_back(n);
            }
        }
        return res;
    }
};