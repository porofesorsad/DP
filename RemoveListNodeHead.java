//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
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
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head == null) {
            return head;
        }
        if(head.val == val) {
            head = head.next;
        }
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode p = head;
        ListNode q = null;
        while(p != null) {
            if(p.val == val) {
                q.next = p.next;
                p = p.next;
                continue;
            }
            q = p;
            p = p.next;
        }
        
        return head;    
    }
}