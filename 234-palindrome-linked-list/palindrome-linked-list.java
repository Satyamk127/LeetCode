

class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode temp = head;
      ArrayList<Integer> arr = new ArrayList<>();
      while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
      }
      int i=0; 
      int j=arr.size()-1;
      while(i<j){
        if(arr.get(i)!=arr.get(j)){
            return false;
        }
        i++;
        j--;
      }
      return true;


        
    }
}