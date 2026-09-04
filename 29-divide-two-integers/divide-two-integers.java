class Solution {
    public int divide(int dividend, int divisor) {

        // Special overflow case
        if (dividend == Integer.MIN_VALUE &&
            divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Check whether answer should be negative
        boolean negative = (dividend < 0) != (divisor < 0);

        // Convert to long
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        while (a >= b) {

            long current = b;
            long count = 1;

            // Keep doubling
            while (current + current <= a) {
                current = current + current;
                count = count + count;
            }

            // Subtract the largest possible chunk
            a = a - current;

            // Add how many divisors we used
            quotient = quotient + count;
        }

        // Apply sign
        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }

}