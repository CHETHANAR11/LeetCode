/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy= newNode(-1);
//         ListNode tail=dummy;
//         int carry=0;
//         while(l1!=null || l2!=null || carrry!=0){
//             ListNode curr = new Node(0);
//             int v1=0;
//             int v2=0;
//             if(l1!=null)
//                 v1=l1.val;
//             if(l2!=null)
//                 v2=l2.val;
//             inr sum=l1.val+l2.val+carry;
//             carry=sum/10;
//             sum=sum%10;
//             current.val=sum;
//             tail.next=curr;
//             tail=tail.next;
//             l1=l1.next;
//             l2=l.next;
//         }
//         return dummy.next;
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode curr = new ListNode(sum);
            tail.next = curr;
            tail = tail.next;
        }
        return dummy.next;
    }
}
