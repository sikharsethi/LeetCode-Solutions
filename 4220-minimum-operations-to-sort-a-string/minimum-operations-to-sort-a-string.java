class Solution {
    public int minOperations(String s) {
         int n = s.length();
        
        // Case 0: Already sorted
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) return 0;
        
        // Case -1: Length is 2 and not sorted (cannot choose a valid proper substring)
        if (n == 2) return -1;
        
        // Find the absolute minimum and maximum characters
        char[] chars = s.toCharArray();
        char minChar = chars[0];
        char maxChar = chars[0];
        for (char c : chars) {
            if (c < minChar) minChar = c;
            if (c > maxChar) maxChar = c;
        }
        
        // Case 1: Min character is at the start OR Max character is at the end
        if (chars[0] == minChar || chars[n - 1] == maxChar) {
            return 1;
        }
        
        // Case 2: Min character is NOT at the end OR Max character is NOT at the start
        for (int i = 1; i < n - 1; i++) {
    if (chars[i] == minChar || chars[i] == maxChar) {
        return 2;
    }
}

       
        return 3;
    }
}