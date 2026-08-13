class Solution {

    static class Node {
        int leftChar;
        int rightChar;

        int leftLen;
        int rightLen;
        int best;
        int len;

        Node(int ch) {
            leftChar = ch;
            rightChar = ch;
            leftLen = 1;
            rightLen = 1;
            best = 1;
            len = 1;
        }

        Node() {}
    }

    Node[] tree;
    char[] arr;

    public int[] longestRepeating(String s, String queryCharacters,
                                  int[] queryIndices) {

        int n = s.length();
        arr = s.toCharArray();

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int k = queryIndices.length;
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            int index = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            arr[index] = ch;

            update(1, 0, n - 1, index, ch);

            ans[i] = tree[1].best;
        }

        return ans;
    }

    void build(int node, int start, int end) {

        if (start == end) {
            tree[node] = new Node(arr[start] - 'a');
            return;
        }

        int mid = start + (end - start) / 2;

        build(node * 2, start, mid);
        build(node * 2 + 1, mid + 1, end);

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    void update(int node, int start, int end, int index, char ch) {

        if (start == end) {
            tree[node] = new Node(ch - 'a');
            return;
        }

        int mid = start + (end - start) / 2;

        if (index <= mid) {
            update(node * 2, start, mid, index, ch);
        } else {
            update(node * 2 + 1, mid + 1, end, index, ch);
        }

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }


    Node merge(Node left, Node right) {

        Node res = new Node();

        res.len = left.len + right.len;

        res.leftChar = left.leftChar;
        res.rightChar = right.rightChar;

      
        res.leftLen = left.leftLen;

        if (left.leftLen == left.len &&
            left.rightChar == right.leftChar) {

            res.leftLen = left.len + right.leftLen;
        }

        res.rightLen = right.rightLen;

        if (right.rightLen == right.len &&
            left.rightChar == right.leftChar) {

            res.rightLen = right.len + left.rightLen;
        }

        res.best = Math.max(left.best, right.best);

        if (left.rightChar == right.leftChar) {
            res.best = Math.max(
                res.best,
                left.rightLen + right.leftLen
            );
        }

        return res;
    }
}