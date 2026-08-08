/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        
        Node temp = head;

 if (head == null) {
            return null;
        }
        
         if (x == 1) {
            return head.next;
        }
        
        for(int i=1; i<x-1; i++){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna