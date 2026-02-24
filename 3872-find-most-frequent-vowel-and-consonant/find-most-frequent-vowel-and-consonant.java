class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='i' || ch=='a' || ch=='e' || ch=='o'||ch=='u'){
                if(map.containsKey(ch)){
                    int fre = map.get(ch);
                    map.put(ch,fre+1);
                }else{
                    map.put(ch,1);
                }
            }
        }
       int max = 0;

         for(char ch : map.keySet()){
             int fre = map.get(ch);
    
              if(max <= fre){
              max = fre;
            }
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='i' && ch!='a' && ch!='e' && ch!='o'&&ch!='u'){
                if(map1.containsKey(ch)){
                    int fre = map1.get(ch);
                    map1.put(ch,fre+1);
                }else{
                    map1.put(ch,1);
                }
            }
        }
        int max2=0;
        for(char ch : map1.keySet()){
            int fre=map1.get(ch);
            if(max2<=fre){
                max2=fre;
            }
        }

    return max+max2;
    }
}