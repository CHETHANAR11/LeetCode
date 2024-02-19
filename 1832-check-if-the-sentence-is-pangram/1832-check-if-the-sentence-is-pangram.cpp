class Solution {
public:
    bool checkIfPangram(string sentence) {
        array<int, 26> arr = {0};

        for (char ch : sentence) {
            if (isalpha(ch)) {
                int index = ch - 'a';
                arr[index]++;
            }
        }

        for (int count : arr) {
            if (count == 0) {
                return false; 
            }
        }

        return true; 
    }
};
