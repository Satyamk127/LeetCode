class Solution {
    public int minimumDistance(int[] arr) {
        int min = Integer.MAX_VALUE;
        int n= arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]==arr[j] && arr[j]==arr[k]){
                        int d =Math.abs(i - j) +Math.abs(j - k) + Math.abs(k - i);
                        min = Math.min(min,d);
                    }
                }
            }
        }
        if(min== Integer.MAX_VALUE) return -1;
        return min;
        
    }
}