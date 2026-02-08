class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallestnum=1;
        for(int num : nums){
            if(num==smallestnum){
                smallestnum++;
            }else if(num>smallestnum){
                return smallestnum;
            }
        }
        return smallestnum;

        
    }
}