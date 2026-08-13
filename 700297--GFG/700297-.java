/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        int len = 0;
        
        Node temp = head;
        Node prev = null;
        
        if(k == 1){
            return null;
        }
        
        while(temp!=null){
            len++;
            
            if(len % k == 0){
                prev.next = temp.next;
            }
            
            else{
                prev = temp;
            }
            
            temp = temp.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna