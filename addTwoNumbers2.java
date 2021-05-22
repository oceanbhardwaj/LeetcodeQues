class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        int sum=0;
        int carry=0;
        
        while(l1!=null || l2!=null)
        {
            if(l1==null)
                l1=new ListNode(0);
            if(l2==null)
                l2=new ListNode(0);
            sum=l1.val+l2.val+carry;
            carry=sum/10;
            if(sum>9)
                sum=sum%10;
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            l1=l1.next;
            l2=l2.next;
            
        }
        if(carry!=0)
        {dummy.next=new ListNode(carry);
         dummy=dummy.next;
        }
        
        
        ans=reverse(ans.next);
        return ans;
        
        
        
    }
    public ListNode reverse(ListNode node)
    {
        ListNode prev=null;
        ListNode next=null;
        while(node!=null)
        {
            next=node.next;
            node.next=prev;
            prev=node;
            node=next;
        }
        return prev;
    }
}