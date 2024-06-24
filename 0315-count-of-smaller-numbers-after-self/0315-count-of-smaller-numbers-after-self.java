class Solution {
    public List<Integer> countSmaller(int[] nums) {
        //sort: 1 2 5 6
        //nums: 5 2 6 1
        //res: 2 
        //left: 5
        //sorted: 1 2 5 6 
//         int l=nums.length;//4
//         int[] sort=new int[l];
//         for(int i=0;i<l;i++){
//             sort[i]=nums[i];
//         }
//         Arrays.sort(sort);
//         List<Integer> sorted=new ArrayList<>();
//         for(int i=0;i<l;i++){
//             sorted.add(sort[i]);
//         }
//         List<Integer> res=new ArrayList<>();
//         List<Integer> left=new ArrayList<>();
//         HashMap<Integer,Boolean> hm=new HashMap<>();
//         for(int i=0;i<0;i++){
//             hm.put(nums[i],false);
//         }
//         for(int i=0;i<l;i++){
//             if(i==0){
//                 res.add(sorted.indexOf(nums[i]));//res->2
//                 left.add(nums[i]);//left->5
//             }
//             else{
//                 int count=0;
//                 int index=sorted.indexOf(nums[i]);//index of that elemt in sorted
             
//                 for(int k=0;k<index;k++){
//                     // if(hm.getValue(index)==true &&hm.getValue(index)==sorted[j]){
//                     //    continue;
//                     // }  
//                     if(hm.get(sorted.get(k))){
//                         continue;
//                     }
//                     if(left.contains(sorted.get(k))){
//                        hm.put(sorted.get(k), true);
//                       count++;
//                     }
//                 }
//                 int j=index-count;
//                 res.add(j);
                
//                 left.add(nums[i]);
//             }
//         }
        
//     return res;
         int n = nums.length;
        List<Integer> result = new ArrayList<>(n);
        
        if (n == 0) {
            return result;
        }
        
        // Create a copy of nums and sort it
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        // Create a map from number to its rank in the sorted array
        Map<Integer, Integer> ranks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ranks.put(sortedNums[i], i + 1); // rank starts from 1
        }
        
        // Create a Fenwick Tree (Binary Indexed Tree) of the same size
        FenwickTree fenwickTree = new FenwickTree(n);
        
        // Traverse the original array from right to left
        for (int i = n - 1; i >= 0; i--) {
            int rank = ranks.get(nums[i]);
            result.add(fenwickTree.query(rank - 1)); // query for the number of elements less than the current number
            fenwickTree.update(rank, 1); // update the Fenwick Tree with the current number
        }
        
        // Reverse the result list to get the correct order
        Collections.reverse(result);
        
        return result;
    }
      private class FenwickTree {
        private int[] tree;

        public FenwickTree(int size) {
            tree = new int[size + 1];
        }

        public void update(int index, int delta) {
            while (index < tree.length) {
                tree[index] += delta;
                index += index & -index;
            }
        }

        public int query(int index) {
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & -index;
            }
            return sum;
        }
    }
}