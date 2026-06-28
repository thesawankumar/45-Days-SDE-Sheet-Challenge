class Pair{
    int val;
    int minVal;

    Pair(int val, int minVal){
        this.val = val;
        this.minVal = minVal;
    }
}
class MinStack {
    Stack<Pair> st;
    
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.size() == 0){
            st.push(new Pair(val, val));
        }else{
            int min = Math.min(val, st.peek().minVal);
            st.push(new Pair(val, min));
        }
    }
    
    public void pop() { 
       st.pop();
    }
    
    public int top() {
        Pair p = st.peek();
        return p.val;
    }
    

    public int getMin() {
        Pair p = st.peek();
        return p.minVal;
    }


}

