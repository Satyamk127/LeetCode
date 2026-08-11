class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double max =Integer.MIN_VALUE;
         double avg = 0.0;
         double sum = 0.0;
         for(int i=0;i<k;i++){
            sum+=nums[i];
           
         }
          avg=sum/k;
        max = Math.max(max,avg);
         for(int j=1;j<=nums.length-k;j++){
            sum=sum-nums[j-1]+nums[j+k-1];
            avg=sum/k;
            max =Math.max(max,avg);


         }
         return max;
        
        
    }
}