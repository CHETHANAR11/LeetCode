class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
          List<Integer> li = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[nums.length];

        for (int num : nums) {
            int newd = 0;
            int numCopy = num;
            int place = 1;

            if (num == 0) {
                newd = mapping[0];
            } else {
                while (num > 0) {
                    int digit = num % 10;
                    newd += mapping[digit] * place;
                    num /= 10;
                    place *= 10;
                }
            }
            li.add(newd);
            hm.put(numCopy, newd); 
        }

        List<int[]> pairedList = new ArrayList<>();
        for (int num : nums) {
            pairedList.add(new int[]{num, hm.get(num)});
        }

        pairedList.sort((a, b) -> Integer.compare(a[1], b[1]));

        int i = 0;
        for (int[] pair : pairedList) {
            arr[i] = pair[0];
            i++;
        }

        return arr;
    }
}