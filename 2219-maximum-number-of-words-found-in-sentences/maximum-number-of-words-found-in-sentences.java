class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            int spaces = 0;
            String s = sentences[i];

            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    spaces++;
                }
            }

            int words = spaces + 1;
            if (words > maxWords) {
                maxWords = words;
            }
        }

        return maxWords;
    }
}