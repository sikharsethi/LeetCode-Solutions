class Solution {
    public int findNthDigit(int n) {
        int length = 1;
        long count = 9;
        long start = 1;

        // Find the length of the number where the nth digit lies
        while (n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number that contains the nth digit
        start += (n - 1) / length;

        // Find the specific digit in the number
        String s = Long.toString(start);
        return s.charAt((n - 1) % length) - '0';
    }
}
