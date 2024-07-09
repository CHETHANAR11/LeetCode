class Solution {
    public List<Integer> partitionLabels(String s) {
        int len=s.length();
        HashMap<Character,Integer> hp=new HashMap<>();
        for (int i = 0; i < len; i++) {
            hp.put(s.charAt(i), i);
        }
        int size=0,end=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<len;i++){
            end=Math.max(end,hp.get(s.charAt(i)));
            size++;
            if(i==end){
                li.add(size);
                size=0;
            }
        }
        return li;
    }
}