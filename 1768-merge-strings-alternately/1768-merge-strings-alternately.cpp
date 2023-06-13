class Solution {
public:
    string mergeAlternately(string word1, string word2) {
       string str;
        int w1=word1.size();
        int w2=word2.size();
        int i=0,j=0;
        while(i<w1||j<w2)
        {
            if(i<w1)
                str.push_back(word1[i++]);
            if(j<w2)
                str.push_back(word2[j++]);
        }
        return str;
    }
    
};