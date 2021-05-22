class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode even_list=new ListNode(0);
        ListNode even=even_list;
        ListNode odd_list=new ListNode(0);
        ListNode odd=odd_list;
        int count=0;
        while(head!=null)
        {
            if(count%2==0)
            {
                even.next=head;
                even=even.next;
            }
            else
            {
                odd.next=head;
                odd=odd.next;
            }
            count++;
            head=head.next;
        }
       if(odd.next!=null)
           odd.next=null;
        else
            even.next=null;
        even.next=odd_list.next;
        return even_list.next;
    }
}