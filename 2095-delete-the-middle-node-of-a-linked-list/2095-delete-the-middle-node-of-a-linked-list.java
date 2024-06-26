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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null)return head;
        if(head.next==null)return null;
        ListNode pre=null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast==null ||fast.next!=null){           
            pre=slow;
        if (fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
            else{
                slow=slow.next;
                break;
            }
        }
        if(pre==null) return head;
        pre.next=slow.next;
        return head;
        
    }
}