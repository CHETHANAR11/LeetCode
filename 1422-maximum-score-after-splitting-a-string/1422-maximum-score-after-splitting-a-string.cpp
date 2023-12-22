class Solution {
public:
    int maxScore(string s) {
        
        int sum=0;
        int count_left=0;
        int count_right= std::count(s.begin(),s.end(),'1');
        for(int i=0;i<s.length()-1;i++){
            count_left+=(s[i]=='0');
            count_right-=(s[i]=='1');
            sum=std::max(sum,count_left+count_right);
        }
        return sum;
    }
};