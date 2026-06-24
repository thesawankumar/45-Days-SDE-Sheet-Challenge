class myQueue {
    
    private int[]arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        capacity=n;
        arr=new int[capacity];
        front=0;
        rear =-1;
        size=0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==capacity;
    }

    public void enqueue(int x) {
        if(isFull()) return;
        rear=(rear+1)%capacity;
        arr[rear]=x;
        size++;
        // Enqueue
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) return;
        
        front=(front+1)%capacity;
        size--;
    }

    public int getFront() {
        // Get front element
        
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()) return -1;
        return arr[rear];
    }
}
