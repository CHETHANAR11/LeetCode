class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        // Populate the HashMap
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!hm.containsKey(size)) {
                hm.put(size, new ArrayList<>());
            }
            hm.get(size).add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();

        // Group the people based on group size
        for (int size : hm.keySet()) {
            List<Integer> list = hm.get(size);
            for (int i = 0; i < list.size(); i += size) {
                ans.add(new ArrayList<>(list.subList(i, i + size)));
            }
        }

        return ans;
    }
}
