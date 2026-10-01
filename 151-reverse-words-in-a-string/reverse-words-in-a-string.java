class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        
        while (i >= 0) {
            // Skip trailing spaces for the current word
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break; // All words processed
            
            // Find the start index of the current word
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            // Append a space if this is not the first word added
            if (result.length() > 0) {
                result.append(" ");
            }
            
            // Append the word from index i + 1 to j
            result.append(s.substring(i + 1, j + 1));
        }
        
        return result.toString();
    }
}
