class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    var st = new Stack<Integer>();
    var ans = new int[temperatures.length];

    for (var i=0; i < temperatures.length; i++) {
      while (!st.empty() && temperatures[st.peek()] < temperatures[i]) {
        var a = st.pop();
        ans[a] = i-a;
      }
      st.push(i);
    }
    return ans;
    }
}