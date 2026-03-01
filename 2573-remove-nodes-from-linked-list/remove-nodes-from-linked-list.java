class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode temp = removeNodes(node.next);

        node.next = temp;
        if (temp == null || node.val >= temp.val) {
            return node;
        }
        return temp;
    }
}