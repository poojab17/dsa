class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qstudents = new LinkedList<>();
        Stack<Integer> sandwichStack = new Stack<>();

        for(int i=sandwiches.length-1; i>=0;i--){
            sandwichStack.push(sandwiches[i]);
        }

        for(int i=0; i<students.length;i++){
            qstudents.offer(students[i]);
        }
        int c = 0;
        while(!sandwichStack.isEmpty() && c<qstudents.size()){
            if(!sandwichStack.peek().equals(qstudents.peek())){
                int s = qstudents.poll();
                qstudents.offer(s);
                c++;;
            }

            else{
               
                 sandwichStack.pop();
                qstudents.remove();
                c=0;
            }
        }
         return qstudents.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna