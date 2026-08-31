class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;

        int firstCritical = -1;
        int lastCritical = -1;

        int p = Integer.MAX_VALUE;

        while (curr.next != null) {

            ListNode next = curr.next;

            boolean isCritical =
                    (curr.val > prev.val && curr.val > next.val) ||
                    (curr.val < prev.val && curr.val < next.val);

            if (isCritical) {

                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    p = Math.min(
                           p,
                            index - lastCritical
                    );
                }

                lastCritical = index;
            }

            prev = curr;
            curr = next;
            index++;
        }

        if (firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }

        int maxDistance = lastCritical - firstCritical;

        return new int[]{p, maxDistance};
    }
}