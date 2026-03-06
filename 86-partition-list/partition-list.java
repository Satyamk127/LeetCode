
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t = head;
        ListNode t1 = d1 ; // small value
        ListNode  t2 = d2; // big value
        while(t!=null){
            if(t.val<x){
                t1.next=t;
                t1= t1.next;
            }else{
                t2.next=t;
                t2= t2.next;
            }
            t=t.next;
        }
        t1.next=d2.next;
        t2.next=null;
        return d1.next;

        
    }
}