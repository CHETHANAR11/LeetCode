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
class Solution 
{
    ListNode nhead=null;
    ListNode ntail=null;
    public void addFirst(ListNode node)
    {
        if(nhead==null)
        {
            nhead=node;
            ntail=node;
        }
        else
        {
            node.next=nhead;
            nhead=node;
        }
    }
    
    public int length(ListNode head) // length of LL
    {
        if(head==null)
            return 0;
        int c=0;
        while(head!=null)
        {
            head=head.next;
            c++;
        }
        return c;
    }

    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head==null || head.next==null || k==1)
            return head;
        int len=length(head);
        ListNode originalhead=null;
        ListNode originaltail=null;
        ListNode curr=head;
        ListNode fwd=curr;
        while(len>=k)
        {
            int temp=k;
            while(temp>0)
            {
                fwd=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=fwd;
                temp--;
            }
            if(originalhead==null)
            {
                originalhead=nhead;
                originaltail=ntail;
            }
            else
            {
                originaltail.next=nhead;
                originaltail=ntail;
            }
            nhead=null;
            ntail=null;
            len-=k;
        }
        originaltail.next=curr;
        return originalhead;
    }
}