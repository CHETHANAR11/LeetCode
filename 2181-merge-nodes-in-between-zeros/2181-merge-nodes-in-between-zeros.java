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
    public ListNode mergeNodes(ListNode head) {
          ListNode dummy = new ListNode(0); // Dummy node to handle the result list
        ListNode curr = dummy; // Pointer to build the result list

        head = head.next; // Skip the first zero node

        while (head != null) {
            int sum = 0;
            while (head != null && head.val != 0) {
                sum += head.val;
                head = head.next;
            }
            curr.next = new ListNode(sum); // Add the sum to the result list
            curr = curr.next; // Move the pointer to the new node
            if (head != null) {
                head = head.next; // Skip the zero node
            }
        }

        return dummy.next; 
    }
}