class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        
        int totalTime = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // Add the smaller value: either the full duration or the time gap to the next attack
            totalTime += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        
        // The last attack always deals the full poison duration
        totalTime += duration;
        return totalTime;
    }
}
