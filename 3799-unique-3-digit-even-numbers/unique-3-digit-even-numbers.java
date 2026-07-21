class Solution {
    public int totalNumbers(int[] arr) {
         int n = arr.length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(i==k || j==k) continue;
                    if(arr[k]%2!=0) continue;

                    int ans =arr[i]*100+arr[j]*10+arr[k];
                    set.add(ans);
                }
            }
        }
        int [] ans = new int[set.size()];
        int k=0;
        for(int e:set){
            ans[k++]=e;
        }
        return set.size();
        
       
        
    }
}