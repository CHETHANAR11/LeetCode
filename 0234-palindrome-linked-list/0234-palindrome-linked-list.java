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
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
            return true;
        }

        ListNode half1=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode half2=reverse(slow.next);
        while(half1!=null && half2!=null){
            if(half1.val!=half2.val){
                return false;
            }
                half1=half1.next;
                half2=half2.next;
            
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        return temp;
    }
}