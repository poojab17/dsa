class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length;i++){
            q.offer(i);
        }
        
        int time = 0;
        while(!q.isEmpty() && tickets[k]!=0){
            time++;
            int idx = q.poll();
            tickets[idx]--;

            if(tickets[idx]==0){
                if(idx == k){
                    return time;
                }
            }

            else{
                q.offer(idx);
            }
        }
return time;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna