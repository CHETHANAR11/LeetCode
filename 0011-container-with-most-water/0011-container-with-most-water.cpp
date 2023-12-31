class Solution {
public:
    int maxArea(vector<int>& height) {
       int i = 0;
        int j = height.size() - 1;
        int max = 0;

        while (i < j) {
            int h = std::min(height[i], height[j]);
            int w = j - i;
            int area = h * w;

            max = std::max(max, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max; 
    }
};