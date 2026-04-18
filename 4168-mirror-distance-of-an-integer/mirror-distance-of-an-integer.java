class Solution {
    public int mirrorDistance(int n) {
        int r=n;

        int res =0;
        while(n!=0){
            int p = n%10;
            res=res*10+p;
            n/=10;
        }

        int result = Math.abs(r-res);

        return result;
        
    }
}