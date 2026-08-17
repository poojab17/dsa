class myQueue {

    // Constructor
    int arr[];
    int front;
    int rear;
    int size;
    int currsize =0;


    public myQueue(int n) {
        // Define Data Structures
          size = n;
        arr = new int[n];
        front = -1;
        rear = -1;
        currsize = 0;

    }

    public boolean isEmpty() {
        // Check if queue is empty
        return currsize==0;

    }

    public boolean isFull() {
        // Check if queue is full
        return currsize==size;
    }

    public void enqueue(int x) {

        // Enqueue
          if(isFull())
            return;

        if(isEmpty()) {
            front = rear = 0;
        }
        else {
            rear++;
        }

        arr[rear] = x;
        currsize++;
    }

    public void dequeue() {
        // Dequeue
         if(isEmpty())
            return;

        if(front == rear) {
            front = rear = -1;
        }
        else {
            front++;
        }

        currsize--;
    }

    public int getFront() {
        // Get front element
         if(isEmpty())
            return -1;

        return arr[front];
    }

    public int getRear() {
        // Get last element
           if(isEmpty())
            return -1;

        return arr[rear];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna