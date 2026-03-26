class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : s){
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());

        
    }
}