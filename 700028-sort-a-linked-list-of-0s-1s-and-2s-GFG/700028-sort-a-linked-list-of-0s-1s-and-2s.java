/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zero = new Node(0);
        Node one = new Node(0);
        Node two = new Node(0);
        
        Node z = zero ;
        Node o = one ;
        Node t = two ;
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0){
                z.next = temp;
                z = temp;
            }
            
            else if(temp.data == 1){
                o.next = temp;
                o = temp;
            }
            
            else{
                t.next = temp;
                t = temp;
            }
            temp = temp.next;
        }
        if (one.next != null) {
            z.next = one.next;
            o.next = two.next;
        }
        else {
            z.next = two.next;
        }

        t.next = null;
        return zero.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna