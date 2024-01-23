class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> li = new ArrayList<>();
        li.add(0);
        int res = 0;
        for (String s : arr) {
            int a = 0;
            int dup = 0;
            for (char c : s.toCharArray()) {
                dup |= a & (1 << (c - 'a'));
                a |= 1 << (c - 'a');
            }
            if (dup > 0)    continue;
            for (int i = li.size() - 1; i >= 0; i--) {
                if ((li.get(i) & a) > 0) continue;
                li.add(li.get(i) | a);
                res = Math.max(res, Integer.bitCount(li.get(i) | a));
            }
            
        }
        return res;
    }
}