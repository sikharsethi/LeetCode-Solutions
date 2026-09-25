class Solution {
    public int primePalindrome(int n) {
        while (true) {
            // Check if the current number satisfies both conditions
            if (reverse(n) == n && isPrime(n)) {
                return n;
            }
            
            // Optimization trick: Skip all 8-digit numbers
            // because even-digit palindromes are multiples of 11 (not prime)
            if (n > 10000000 && n < 100000000) {
                n = 100000000; // Jump right to the 9-digit range
            }
            
            n++;
        }
    }

    // Checks if a number is prime
    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int v = 2; v * v <= x; ++v) {
            if (x % v == 0) {
                return false;
            }
        }
        return true;
    }

    // Reverses the digits of the number to check for palindrome
    private int reverse(int x) {
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
}
