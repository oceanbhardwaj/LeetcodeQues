 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        ListNode slow=head;
        ListNode first=null;
        ListNode fast=head;
       int count=1;
        while(count<k)
        {
            fast=fast.next;
            count++;
        }
        first=fast;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode second=slow;
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
        return head;
        
    }
}