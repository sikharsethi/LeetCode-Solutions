class Solution {
    public boolean checkPerfectNumber(int num) {
        // Perfect numbers must be greater than 1
        if (num <= 1) {
            return false;
        }

        // Start with 1 because 1 is a divisor for every number
        int sum = 1; 

        // Loop up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor
                
                // Add the matching pair divisor (e.g., if num is 28 and i is 2, add 14)
                // Avoid adding the square root twice (like 6*6 for 36)
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
