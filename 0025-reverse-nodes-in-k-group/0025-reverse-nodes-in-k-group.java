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
    public ListNode reverse(ListNode start,ListNode end){
        ListNode prev = null;
        
        while(start != end){
            ListNode next = start.next;
            start.next = prev;

            prev = start;
            start = next;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode start = head;
        ListNode end = head;


        if(head == null){
            return head;
        }

       
        for(int i=0; i<k;i++){
            if(end == null){
                return head;
            }
            end = end.next;
        }
        
       
       ListNode res = reverse(start,end);
       start.next = reverseKGroup(end,k);

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna