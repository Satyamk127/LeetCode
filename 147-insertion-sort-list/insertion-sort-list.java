
class Solution {
    public int k=0;
    public void Add(ListNode head,int [] arr){
        ListNode temp=head;
        while(temp!=null){
            arr[k++]=temp.val;
            temp=temp.next;
        }

    }
    public int Count(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void Sort(int [] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public ListNode insertionSortList(ListNode head) {
        
        int count=Count( head);
        int [] arr = new int[count];
        Add(head,arr);
        Sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<count;i++){
            ListNode p1=  new ListNode(arr[i]);
            temp.next=p1;
            temp=temp.next;
        }
        return dummy.next;
        
        


        
    }
}