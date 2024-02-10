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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;  
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        
        ListNode dummy = new ListNode(-1); // Dummy node to handle cases where left is the head.
        dummy.next = head;
        
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        
        ListNode revStart = prev.next;
        ListNode revEnd = revStart;
        ListNode revPrev = null;
        ListNode next = null;
        
        for (int i = left; i <= right; i++) {
            next = revEnd.next;
            revEnd.next = revPrev;
            revPrev = revEnd;
            revEnd = next;
        }
        
        prev.next = revPrev;
        revStart.next = revEnd;
        
        return dummy.next;
    }
}
