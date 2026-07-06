class Solution {
    public int[] sortedSquares(int[] arr) {
        int n= arr.length;
        int [] ans = new int[n];
        int i=0;
        int j=arr.length-1;
        int k=n-1;
        while(i<=j){
            int p=Math.abs(arr[i]);
            int q = Math.abs(arr[j]);
            if(p>q){
                ans[k--]=p*p;
                i++;
            }else{
                ans[k--]=q*q;
                j--;
            }

        }
        return ans;
        
    }
}