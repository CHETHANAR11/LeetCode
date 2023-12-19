// class Solution {
// public:
//     string reverseVowels(string s) {
//         stack<int> st;
//         int n=s.size();
//         for(int i=0;i<n;i++)
//         {
//             if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
//                 st.push(s[i]);
            
//         }
//         string str="";
//         for(int i=0;i<n;i++)
//         {
//             if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
//             {
//                 str+=st.top();
//                 st.pop();
//             }
//             else
//                 str+=s[i];
//         }
//         return str;
//     }
// };

#include <stack>
#include <string>

class Solution {
public:
    std::string reverseVowels(std::string s) {
        std::stack<char> st;
        int n = s.size();
        
        // Push vowels onto the stack
        for (int i = 0; i < n; ++i) {
            if (isVowel(s[i])) {
                st.push(s[i]);
            }
        }

        std::string str = "";
        
        // Pop vowels from the stack and replace in the string
        for (int i = 0; i < n; ++i) {
            if (isVowel(s[i])) {
                str += st.top();
                st.pop();
            } else {
                str += s[i];
            }
        }
        
        return str;
    }

private:
    bool isVowel(char c) {
        // Convert to lowercase and check if it's a vowel
        c = tolower(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
};
