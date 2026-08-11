class Solution {
    public boolean isVawel(String s , int k){
        char ch = s.charAt(k);
        if(ch=='a' || ch=='o' || ch=='i' || ch=='e' || ch=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int max =0;
        for(int i=0;i<k;i++){
            if(isVawel(s,i)){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(isVawel(s,i-k)){
                count--;
            }
            if(isVawel(s,i)){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}