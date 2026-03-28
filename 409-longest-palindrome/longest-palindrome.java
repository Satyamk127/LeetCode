class Solution {
    public int longestPalindrome(String s) {
        
        int[] count = new int[128]; // ASCII
        
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int c : count) {
            if (c % 2 == 0) {
                length += c;
            } else {
                length += c - 1;
                oddFound = true;
            }
        }

        if (oddFound) length += 1;

        return length;
    }
}