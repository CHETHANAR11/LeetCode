class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
//         Queue<Integer> stu=new Queue<>();
//          Stack<Integer> san=new Stack<>(); 
//         for(i in student){
//             stu.put(i);
//         }
//         for(i in sandwitches){
//             san.put(i);
//         }
//         for(i in students){
//             for(j in sandwiches){
//                 if(i==j){
//                     stu.pop();
//                     san.pop();
//                 }
//                 else{
//                      int back=stu.pop();
                    
//                 }
//             }
//         }
        int[] count=new int[2];
        for(int student:students){
            count[student]++;
        }
        for(int sandwich: sandwiches){
            if(count[sandwich]==0){
                return count[sandwich ^ 1];
            }
            count[sandwich]--;
        }
        return 0;
    }
}