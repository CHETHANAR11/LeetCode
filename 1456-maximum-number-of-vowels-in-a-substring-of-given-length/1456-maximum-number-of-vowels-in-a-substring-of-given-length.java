// class Solution {
//     public int maxVowels(String s, int k) {
//       char[] charr = s.toCharArray();
//       int max=0;
//         int count=0;
//         for(int i=0;i<charr.length;i++){
//             for(int j=0;j<k;j++){
//             if(charr[i]=='a'||charr[i]=='e'||charr[i]=='i'||charr[i]=='o'||charr[i]=='u')
//               {
//                 count++;
//               }
//             }
//             if(max<count)
//                 count=max;
//         }
//         return max;
//     }
// }

class Solution {
    public int maxVowels(String s, int k) {
        char[] charr = s.toCharArray();
        int max = 0;
        int count = 0; 
        for (int i = 0; i < k; i++) {
            if (isVowel(charr[i])) {
                count++;
            }
        }
        
        max = count;
        
        for (int i = k; i < charr.length; i++) {
            if (isVowel(charr[i - k])) {
                count--;
            }        
            if (isVowel(charr[i])) {
                count++;
            }
       
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
