class myStack {
    int size;
    int arr[];
    int top;
    

    public myStack(int n) {
        // Define Data Structures
        top=-1;
        arr=new int[n];
        size=n;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(top==size-1)
        {
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(!isFull())
        {
            arr[++top]=x;
        }
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(!isEmpty())
        {
            top--;
        }
    }

    public int peek() {
        // Returns the top element of the stack
        if(!isEmpty())
        {
            return arr[top];
        }
        return -1;
    }
}