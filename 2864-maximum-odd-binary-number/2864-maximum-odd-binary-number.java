class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr= s.toCharArray();
        int N= arr.length;
        Arrays.sort(arr);
        int sec=N-2;
        for(int i=0;i<N/2;i++){
            char t=arr[i];
            arr[i]=arr[sec-i];
            arr[sec-i]=t;
        }
        return new String(arr);
        
    }
}