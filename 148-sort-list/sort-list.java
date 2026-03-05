
class Solution {
     ListNode Merge(ListNode t1, ListNode t2) {
        // code here
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while(t1!=null && t2!=null){
            
            if(t1.val>=t2.val){
                curr.next=t2;
                curr=t2;
                t2=t2.next;
            }else{
                curr.next=t1;
                curr=t1;
                t1=t1.next;
            }
        }
        
        if(t1==null){
            curr.next=t2;
        }
        if(t2==null){
            curr.next=t1;
        }
        
        return dummy.next;
        
    
        
    }


    public ListNode sortList(ListNode head) {
        if(head ==null ||head.next==null) return head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next=null;

        head = sortList(head);
        head1= sortList(head1);
        return Merge(head, head1);

        
    }
}