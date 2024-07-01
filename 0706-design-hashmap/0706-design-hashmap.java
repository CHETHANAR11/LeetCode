class MyHashMap {
     HashMap<Integer,Integer> hm;
    public MyHashMap() {
       hm=new HashMap<>();
    }
    
    public void put(int key, int value) {
        hm.put(key,value);
    }
    
    public int get(int key) {
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
        if(m.getKey()==key){
            return m.getValue();
        }
        }
        return -1;
    }
    
    public void remove(int key) {
         for(Map.Entry<Integer,Integer> m:hm.entrySet()){
        if(m.getKey()==key){
            hm.remove(key);
            return;
        }
       }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */