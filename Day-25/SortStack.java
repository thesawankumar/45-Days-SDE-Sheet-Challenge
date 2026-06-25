class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())
        {
            return;
        }
        int temp=st.pop();
        sortStack(st);
        insertAtEnd(st,temp);
    }
    public void insertAtEnd(Stack<Integer> st,int element)
    {
        if(st.isEmpty() || st.peek() <= element)
        {
            st.push(element);
            return;
        }
        int top=st.pop();
        insertAtEnd(st,element);
        st.push(top);
    }
}