class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean [] arr = new boolean[n];
        arr[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(q.size()>0){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(arr[ele]==false){
                    q.add(ele);
                    arr[ele]=true;
                }
            }
        }

        for(boolean flag : arr){
            if(flag==false) return false;
        }
        return true;
    }
}