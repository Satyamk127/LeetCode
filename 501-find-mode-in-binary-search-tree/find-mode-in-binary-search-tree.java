import java.util.*;

class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);

        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();

        for (int k : map.keySet())
            if (map.get(k) == max)
                list.add(k);

        return list.stream().mapToInt(i -> i).toArray();
    }

    private void dfs(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) return;
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        dfs(node.left, map);
        dfs(node.right, map);
    }
}