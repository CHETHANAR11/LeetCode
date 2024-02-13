class LRUCache 
{
    class Node
    {
        int key;
        int value;
        Node next;
        Node prev;
    }
    void remove(Node node)
    {
        Node m1=node.prev;
        Node p1=node.next;

        m1.next=p1;
        p1.prev=m1;
    }
    void add(Node node)
    {
        Node h=head;
        Node p1=head.next;
        node.next=p1;
        node.prev=h;
        h.next=node;
        p1.prev=node;
    }
    HashMap<Integer,Node>map;
    int cap;
    Node head;
    Node tail;
    public LRUCache(int capacity) 
    {
        map=new HashMap<>();
        cap=capacity;
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) 
    {
        if(map.containsKey(key)==false)
            return -1;
        else
        {
            Node node=map.get(key);
            remove(node);
            add(node);
            return node.value;
        }
    }
    
    public void put(int key, int value) 
    {
        if(map.containsKey(key)==false)
        {
            if(map.size()==cap)
            {
                map.remove(tail.prev.key);  
                remove(tail.prev);
            }
            Node node=new Node();
            node.key=key;
            node.value=value;
            add(node);
            map.put(key,node);
        }
        else
        {
            Node node=map.get(key);
            node.value=value;
            remove(node);
            add(node);

        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */