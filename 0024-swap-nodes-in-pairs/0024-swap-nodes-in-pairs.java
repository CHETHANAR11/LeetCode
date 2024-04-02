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
    public ListNode swapPairs(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next; // New head after swapping pairs
        ListNode prev = null; // Previous node to track while swapping pairs
        ListNode current = head; // Current node to iterate through the list

        while (current != null && current.next != null) {
            ListNode first = current;
            ListNode second = current.next;

            // Swapping pairs
            first.next = second.next;
            second.next = first;

            // Adjusting pointers
            if (prev != null) {
                prev.next = second;
            }
            prev = first;
            current = first.next; // Move to the next pair
        }

        return newHead;
    }
}