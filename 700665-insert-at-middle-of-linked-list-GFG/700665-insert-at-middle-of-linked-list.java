/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // code here
        Node slow = head;
        Node fast = head;
        Node newNode = new Node(x);
          if (head == null) {
            return newNode;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node temp = slow.next;
       slow.next = newNode;
       newNode.next = temp;
       
       return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna