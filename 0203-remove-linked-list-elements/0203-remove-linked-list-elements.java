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
//     public ListNode removeElements(ListNode head, int val) {
//         ListNode temp=head;
//         ListNode pre=temp;
//          while (head != null && head.val == val) {
//             head = head.next;
//         }

//         while(temp!=null){
//             if(temp.val==val) {
//                 if(pre!=null)
//                 pre.next=temp.next;
//                 else 
//                     pre=temp;
//             }
//             temp=temp.next;
            
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handle edge case where the head is null
        if (head == null) {
            return null;
        }
        
        // Skip leading nodes with value val
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;
        ListNode pre = null; // Initialize pre to null
        while (temp != null) {
            if (temp.val == val) {
                if (pre != null) { // Skip the current node if it's not the head
                    pre.next = temp.next;
                }
            } else {
                pre = temp; // Update pre only if no removal is done
            }
            temp = temp.next;
        }
        return head;
    }
}
