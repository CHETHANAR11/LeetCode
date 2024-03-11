class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (map.containsKey(str[i]) && map.containsKey(str[j])) {
                    if (map.get(str[i]) > map.get(str[j])) {
                        char temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
        }
        return new String(str);
    }
}
