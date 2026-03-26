class Solution {
    public int duplicateNumbersXOR(int[] arr) {

        int [] feq = new int[51];
        // count the feq of an array
        for(int i=0;i<arr.length;i++){
            feq[arr[i]]++;
        }
        int res =0;
        for(int i=0;i<feq.length;i++){
            if(feq[i]==2){
                res^=i;
            }
        }
        return res;



        
    }
}