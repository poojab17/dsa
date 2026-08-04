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
        int len = 1;

         if (head == null || head.next == null || k == 0)
            return head;
            
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
             len++;
        }

        if(k == 0){
            return head;
        }

        k %= len;

        temp.next = head;

        //steps to new head
        int steps = len - k;

        ListNode newTail = head;
        for(int i = 1; i<steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }
}