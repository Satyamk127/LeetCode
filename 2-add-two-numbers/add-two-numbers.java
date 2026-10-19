
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode dummy = new ListNode(0);
        ListNode temp= dummy;
        int curry=0;


        while(l1!=null ||l2!=null || curry!=0){
            int sum = curry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
             curry = sum/10;
             int p2= sum%10;
            ListNode p = new ListNode(p2);
            temp.next=p;
            temp = temp.next;
            
            


        }
        return dummy.next;
        
    }
}