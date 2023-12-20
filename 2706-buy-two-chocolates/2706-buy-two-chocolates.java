class Solution {
    public int buyChoco(int[] prices, int money) {
        int max=0;
        int f=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>money)
                continue;
            for(int j=i+1;j<prices.length;j++){
                int sum=prices[i]+prices[j];
                if(sum<=money)
                {
                   
                    int left=money-sum;
                    if(max<=left){
                         f=1;
                          max=left;
                    }
                      
                }
                    
            }
        }
        if(f==1){
            return max;
        }
        return money;
        
    }
}