/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> set = new HashSet<>();
         set.add(head.data);
        Node temp = head;
        
        while(temp.next!=null){
            
            if(set.contains(temp.next.data)){
               
                temp.next = temp.next.next;
            }
            
            else{
                set.add(temp.next.data);
                 temp = temp.next;
            }
            
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna