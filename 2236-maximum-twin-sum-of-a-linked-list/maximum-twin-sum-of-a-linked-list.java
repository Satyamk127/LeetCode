
class Solution {

     public ListNode reverse(ListNode head) {
        if(head==null) return head;
        ListNode temp = head;
        ListNode curr=null;
        ListNode pre=null;
        while(temp!=null){
            curr=temp.next;
            temp.next=pre;
            pre=temp;
            temp=curr;
            
        }
        return pre;

        
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next=null;
        ListNode head2 = reverse(temp);
        int max = Integer.MIN_VALUE;
        int sum=0;

        while(head2!=null){
            int a = head.val;
            int b = head2.val;
             sum = a+b;
            if(max<sum){
                max=sum;
            }
            head=head.next;
            head2=head2.next;
        }
        return max;
        
    }
}