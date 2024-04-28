class Solution {
    public int addDigits(int num) {
         int sum = 0;
        int temp=num;
        while (temp != 0 ) {                   
            int digit = temp % 10;             
            sum += digit;                  
            temp /= 10;                        
            if(temp==0 && sum>9){             
                temp=sum;                      
                sum=0;
            }
        }
        return sum;
    }
}