

public class Solution {
    public int totalFruit(int[] fruits) {
        // Map to store the fruit type and how many times it appears in our current window
        HashMap<Integer, Integer> fruitCounts = new HashMap<>();
        
        int left = 0;
        int maxFruits = 0;
        
        // 'right' expands the window to the right
        for (int right = 0; right < fruits.length; right++) {
            int currentFruit = fruits[right];
            
            // Add the fruit to our basket (increment its count)
            fruitCounts.put(currentFruit, fruitCounts.getOrDefault(currentFruit, 0) + 1);
            
            // If we have MORE than 2 unique types of fruit, shrink the window from the left
            while (fruitCounts.size() > 2) {
                int leftFruit = fruits[left];
                // Decrease the count of the leftmost fruit
                fruitCounts.put(leftFruit, fruitCounts.get(leftFruit) - 1);
                
                // If its count hits 0, completely remove it so the map size drops back to 2
                if (fruitCounts.get(leftFruit) == 0) {
                    fruitCounts.remove(leftFruit);
                }
                
                // Move the left pointer forward
                left++;
            }
            
            // Calculate the maximum window size seen so far
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        
        return maxFruits;
    }
}
