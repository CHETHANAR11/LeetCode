class Solution {
public:
    int myAtoi(string s) {
        if(s.length()==0) return 0;
        
        int i=0;
        int sign=+1;
        long ans=0;
        while(i<s.size() && s[i]==' '){
            i++;
        }
        s=s.substr(i);
        
        if(s[0]=='-') sign=-1;
        
        int Min=INT_MIN,max=INT_MAX;
        i=(s[0]=='-'|| s[0]=='+')?1:0;
        
        while(i<s.length()){
            if(s[i]==' ' || !isdigit(s[i])) break;
            
            ans=ans*10+s[i]-'0';
            
            if(sign==-1 && -1*ans < Min) return Min;
            if(sign==+1 && ans>max) return max;
            
            i++;
        }
        return (int)(sign*ans);
    }
};