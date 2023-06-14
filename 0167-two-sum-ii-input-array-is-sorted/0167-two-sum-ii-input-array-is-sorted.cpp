class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) 
    {
        vector<int> num;
        int i=0;
        int j=numbers.size()-1;
        while(i<j)
        {
            if((numbers[i]+numbers[j]>target))
            {
                j--;
            }
            if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            if(numbers[i]+numbers[j]==target)
            {
                num.push_back(i+1);
                num.push_back(j+1);
                return num;
            }
        }
        return num;
        
    }
};