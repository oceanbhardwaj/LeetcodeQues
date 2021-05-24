class Solution {
    public Node flatten(Node head) {
        Node tail=null;
        Node curr=head;
        Stack<Node> s=new Stack<>();
        while(curr!=null)
        {
            if(curr.child!=null)
            {
                Node child=curr.child;
                if(curr.next!=null)
                {
                    s.push(curr.next);
                    curr.next.prev=null;
                }
                curr.next=child;
                child.prev=curr;
                curr.child=null;
                
            }
            tail=curr;
            curr=curr.next;
            
        }
        while(!s.isEmpty())
        {
            curr=s.pop();
            tail.next=curr;
            curr.prev=tail;
            while(curr!=null)
            {
                tail=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}