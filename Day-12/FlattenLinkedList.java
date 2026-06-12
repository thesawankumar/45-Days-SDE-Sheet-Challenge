/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    
    private Node merge(Node a,Node b)
    {
        Node dummy=new Node(0);
        Node curr=dummy;
        
        while(a !=null && b !=null)
        {
            if(a.data <=b.data)
            {
                curr.bottom=a;
                a=a.bottom;
            }else
            {
                curr.bottom=b;
                b=b.bottom;
            }
        curr=curr.bottom;
        curr.next=null;
        }
        if(a!=null)
        {
            curr.bottom=a;
            
        }else
        {
            curr.bottom=b;
        }
        return dummy.bottom;
    }
    public Node flatten(Node root) {
        // code here
        if(root==null || root.next ==null)
        {
            return root;
        }
        root.next=flatten(root.next);
        root=merge(root,root.next);
        return root;
    }
}