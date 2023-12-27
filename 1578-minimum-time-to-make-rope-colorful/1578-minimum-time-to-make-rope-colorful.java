// class Solution {
//     public int minCost(String colors, int[] neededTime) {
//         int sum=0;
        
//         char[] color = colors.toCharArray();
//         for(int i=0;i<(color.length-1);i++){
//             if(color[i]==color[i+1])
//                { 
//                 if(neededTime[i]<neededTime[i+1])
//                     sum+=neededTime[i];
//                 else
//                     sum+=neededTime[i+1];
//               //  i++;
//                }
//         }
//         return sum;
//     }
// }
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int i = 0, j = 0;

        while (i < neededTime.length && j < neededTime.length) {
            int currTotal = 0, currMax = 0;

            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                currTotal += neededTime[j];
                currMax = Math.max(currMax, neededTime[j]);
                j++;
            }

            totalTime += currTotal - currMax;
            i = j;
        }
        return totalTime;
    }
}