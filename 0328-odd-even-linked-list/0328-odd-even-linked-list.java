class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenDummy = new ListNode();
        ListNode oddDummy = new ListNode();

        ListNode even = evenDummy;
        ListNode odd = oddDummy;

        ListNode temp = head;
        int pos = 1;

        while (temp != null) {
            if (pos % 2 == 1) {
                odd.next = temp;
                odd = odd.next;
            } else {
                even.next = temp;
                even = even.next;
            }

            temp = temp.next;
            pos++;
        }

        even.next = null;
        odd.next = evenDummy.next;

        return oddDummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna