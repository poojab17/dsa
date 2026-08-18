/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    void preorder(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.data);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna