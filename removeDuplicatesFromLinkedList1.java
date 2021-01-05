class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        ListNode n=head.next;
ListNode curr=head;
        while(n!=null && head!=null)
        {
            if( head.val!=n.val)
            {
               head.next=n;
                head=head.next;
                n=head.next;
            }
            else
            {
               n=n.next;
                
            }
            if(n==null)
                head.next=null;
        }
        return curr;
    }
}