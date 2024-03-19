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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0)
            return head;

        int length = 1; // length of the linked list
        ListNode temp = head;

        // Calculate the length of the linked list
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        // Adjust k in case it's larger than the length of the linked list
        k = k % length;
        if (k == 0)
            return head;

        // Find the new tail and break the linked list
        ListNode tail = head;
        for (int i = 1; i < length - k; i++) {
            tail = tail.next;
        }

        // Adjust pointers to rotate the linked list
        ListNode newHead = tail.next;
        tail.next = null;
        temp.next = head;

        return newHead;
    }
}