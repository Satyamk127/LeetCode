class Solution {
    public int minimumDistance(int[] arr) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.computeIfAbsent(arr[i], k-> new ArrayList<>()).add(i);
        }
        int min = Integer.MAX_VALUE;


        for(List<Integer> list : map.values()){
            if(list.size()<3) continue;

            for(int i=0;i+2<list.size();i++){
                int dis=2*(list.get(i+2)-list.get(i));
                min=Math.min(min,dis);
            }
        }
        return min ==Integer.MAX_VALUE ? -1:min;
    }
}