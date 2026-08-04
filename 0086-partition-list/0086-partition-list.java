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
    public ListNode partition(ListNode head, int x) {
        ListNode smalldummy = new ListNode(0);
        ListNode bigdummy = new ListNode(0);
        ListNode small = smalldummy;
        ListNode big = bigdummy;



        while(head != null){
            if(head.val < x){
                small.next = head;
                small = small.next;
            }

            else{
                big.next = head;
                big = big.next;
            }

            head = head.next;
        }

        big.next = null;
        small.next = bigdummy.next;
        return smalldummy.next;

    }
}