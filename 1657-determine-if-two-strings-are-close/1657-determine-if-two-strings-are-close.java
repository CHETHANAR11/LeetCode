class Solution {
  public boolean closeStrings(String word1, String word2) {
    var m1 = new int[26];
    var m2 = new int[26];
    for (var c : word1.toCharArray()) m1[c - 'a']++;
    for (var c : word2.toCharArray()) m2[c - 'a']++;
    for (var i=0; i<26; i++) {
      if (m1[i] == 0 && m2[i] != 0) return false;
      if (m1[i] != 0 && m2[i] == 0) return false;
    }
    Arrays.sort(m1);
    Arrays.sort(m2);
    return Arrays.equals(m1, m2);
  }
}