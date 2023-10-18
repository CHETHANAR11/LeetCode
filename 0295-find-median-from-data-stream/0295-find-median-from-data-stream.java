class MedianFinder {
    PriorityQueue<Integer> minpq,maxpq;

    public MedianFinder() {
      minpq= new PriorityQueue<>();
    maxpq = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxpq.size()>0&& num<=maxpq.peek()){
            maxpq.add(num);
        }
        else{
            minpq.add(num);
        }
        if(maxpq.size()> minpq.size()+1){
            minpq.add(maxpq.poll());
        }
        else if(minpq.size()>maxpq.size()+1){
            maxpq.add(minpq.poll());
                                            }
    }
    
    public double findMedian() {
        if(maxpq.size() >minpq.size()){
            return maxpq.peek();
        }
        else if(maxpq.size()==minpq.size()){
            return (maxpq.peek()+ minpq.peek())/2.0;
        }
        else{
            return minpq.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */