class Solution {
    public int pro(int i){
        int sum =1;
        while(i>0){
            int p = i%10;
            sum=sum*p;
            i/=10;
            }
        return sum;
    }
    public int smallestNumber(int n, int t) {
      
       
        
        for(int i=n ;i<=n*t;i++){
            int r =pro(i);
            if(r%t==0) return i;
            
            
            
        
        }
        return n;

        
      
       
    }
}