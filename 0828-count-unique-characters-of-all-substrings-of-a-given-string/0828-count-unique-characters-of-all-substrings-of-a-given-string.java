class Solution {
    public static int sum;

    public int uniqueLetterString(String S) {
//         sum = 0;
//         char[] ans = s.toCharArray();
//         List<Character> hm = new ArrayList<>();
//         generateSubsets(ans, hm, 0);
//         return sum;
//     }

//     private void generateSubsets(char[] ans, List<Character> currentSubset, int index) {
//         if (index == ans.length) {
//             Set<Character> uniqueChars = new HashSet<>(currentSubset);
//             for(Character c:currentSubset)
//             System.out.print(c);
//             System.out.println();
//             sum += uniqueChars.size();
//             return;
//         }

//         // Include ans[index] in the current subset
//         currentSubset.add(ans[index]);
//         generateSubsets(ans, currentSubset, index + 1);

//         // Exclude ans[index] from the current subset
//         currentSubset.remove(currentSubset.size() - 1);
//         generateSubsets(ans, currentSubset, index + 1);
//     }
          int[][] index = new int[26][2];
        for (int i = 0; i < 26; ++i) Arrays.fill(index[i], -1);
        int res = 0, N = S.length(), mod = (int)Math.pow(10, 9) + 7;
        for (int i = 0; i < N; ++i) {
            int c = S.charAt(i) - 'A';
            res = (res + (i - index[c][1]) * (index[c][1] - index[c][0]) % mod) % mod;
            index[c] = new int[] {index[c][1], i};
        }
        for (int c = 0; c < 26; ++c)
            res = (res + (N - index[c][1]) * (index[c][1] - index[c][0]) % mod) % mod;
        return res;
   }
}