class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null)
            return true;
        ArrayList<Integer> a=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            a.add(curr.val);
            curr=curr.next;
        }
        Collections.reverse(a);
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        for(int i:a)
        {
            ans.next=new ListNode(i);
            ans=ans.next;
        }
        ListNode head2=dummy.next;
        while(head!=null)
        {
            if(head.val!=head2.val)
                return false;
            head=head.next;
            head2=head2.next;
        }
        return true;
        
    }
}
/////////////////////////////////////////////////o(n),o(1)///////////////////
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        ListNode curr=head;
        //finding middle
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        prev.next=null;
        ListNode left=head;
        ListNode right=slow;
        right=reverse(right);
        while(left!=null)
        {
            if(left.val!=right.val)
                return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node)
    {
        ListNode p=null;
        ListNode n=null;
        while(node!=null)
        {
            n=node.next;
            node.next=p;
            p=node;
            node=n;
        }
        return p;
        
    }
}