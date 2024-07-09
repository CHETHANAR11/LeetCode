class Solution {
    public String reorganizeString(String s) {
         HashMap<Character, Integer> hm = new HashMap<>();
        int l = s.length();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int count : hm.values()) {
            if (count > (l + 1) / 2) {
                return "";
            }
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(hm.entrySet());
        
        StringBuilder sb = new StringBuilder();
        
        while (maxHeap.size() > 1) {
            Map.Entry<Character, Integer> entry1 = maxHeap.poll();
            Map.Entry<Character, Integer> entry2 = maxHeap.poll();
            
            sb.append(entry1.getKey());
            sb.append(entry2.getKey());
            
            entry1.setValue(entry1.getValue() - 1);
            entry2.setValue(entry2.getValue() - 1);
            
            if (entry1.getValue() > 0) {
                maxHeap.offer(entry1);
            }
            
            if (entry2.getValue() > 0) {
                maxHeap.offer(entry2);
            }
        }
        
        if (!maxHeap.isEmpty()) {
            sb.append(maxHeap.poll().getKey());
        }
        
        return sb.toString();
    }
}