# [Get Max from Stack](https://www.geeksforgeeks.org/problems/get-max-from-stack/1)
## Medium
Implement a class SpecialStack that supports following operations:

push(x) –&nbsp;Insert an integer x onto the stack.
pop() –&nbsp;Remove the top element from the stack.
peek() – Return the top element&nbsp;from the stack.&nbsp;If the stack is empty, return -1.
getMax() – Retrieve the maximum element from the stack in O(1) time. If the stack is empty, return -1.
isEmpty()&nbsp;–&nbsp;&nbsp;Return true if stack is empty, else false

There will be a sequence of queries&nbsp;queries[][]. The queries are represented in numeric form:

1 x&nbsp;: Call push(x)
2:&nbsp;&nbsp;Call&nbsp;pop()
3:&nbsp;Call peek()
4: Call getMax()
5: Call isEmpty()

The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), getMax(), isEmpty() operations.You only need to implement the above five functions.
Examples:
Input: q = 7, queries[][] = [[1, 2], [1, 3], [3], [2], [4], [1, 1], [4]]
Output: [3, 2, 2]
Explanation: Queries on stack are as follows:push(2) into the Stack
push(3) into the Stack
return top of the stack, i.e 3
remove the element 3 from the top of the stack
return maximum element from the stack i.e 2
push(1) into the stack
return maximum element from the stack i.e 2
Input: q = 5, queries[][] = [[1, 4], [1, 2], [4], [3], [5]]
Output: [4, 2, false]
Explanation: Queries on stack are as follows:push(4) into the Stack
push(2) into the Stackreturn maximum element from the stack i.e 4return top of the stack, i.e 2stack is non-empty, i.e. return false.
Constraints:1 ≤ queries.size() ≤ 1050 ≤ values on the stack ≤ 109