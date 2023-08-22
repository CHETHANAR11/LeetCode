class Solution {
public:
    string reverseWords(string s) {
        stack<string>st;
      string res="";
      for(int i=0;i<s.length();i++)
      {
          if(s[i]!=' ')
          {
              res+=s[i];
          }
          else
          {
              if(res.length()>0)
              st.push(res);
              res="";
          }
      }
       if(res.length()>0)
      st.push(res);
      res="";
      while(!st.empty())
      {   
        
          res+=st.top()+" ";
            st.pop();
      }
      res=res.substr(0,res.length()-1);
      return res;
        
    }
};