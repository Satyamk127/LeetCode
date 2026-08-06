class Solution {

    public int pro(int num) {
        int product = 1;

        if (num == 0) {
            return 0;
        }

        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        return product;
    }

    public int smallestNumber(int n, int t) {

        int i = n;

        while (true) {
            if (pro(i) % t == 0) {
                return i;
            }
            i++;
        }
    }
}