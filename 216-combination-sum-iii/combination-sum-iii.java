import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        solve(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void solve(int start, int k, int n, List<Integer> temp, List<List<Integer>> result) {

       
        if (temp.size() == k && n == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

    
        if (temp.size() > k || n < 0) return;

       
        for (int i = start; i <= 9; i++) {
            temp.add(i);                 
            solve(i + 1, k, n - i, temp, result); 
            temp.remove(temp.size() - 1);
        }
    }
}