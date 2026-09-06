class Solution {
    public int reverse(int x) {
     long reversed = 0; // Use 'long' to hold data that might temporarily exceed 32-bit int bounds

        while (x != 0) {
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            
            // Check if 'reversed' has exceeded the boundaries of a standard Java int
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0; // Return 0 as per standard interview specs when an overflow happens
            }
            
            x = x / 10;
        }

        return (int) reversed; // Cast it back safely to an int
    }
}