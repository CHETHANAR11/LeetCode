class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int count_0= std::count(nums.begin(),nums.end(),0);
        int c=nums.size()-count_0;
        int j=0;
        for(int i=0;i<nums.size();i++){
            {
                if(nums[i]!=0){
                nums[j]=nums[i];
                    j++;
                }
            }
           
        }
       std::fill(nums.begin() + c, nums.end(), 0);

    }
};



