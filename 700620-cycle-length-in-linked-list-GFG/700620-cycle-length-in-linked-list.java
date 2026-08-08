/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        int len = 1;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
          
           if(slow == fast){
                break;
           }
        }
         if(fast==null || fast.next==null)
        return 0;
         
                while(slow.next!=fast){
                    len++;
                    slow = slow.next;
                }
            
        return len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna