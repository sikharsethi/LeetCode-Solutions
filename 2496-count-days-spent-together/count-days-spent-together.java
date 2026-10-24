class Solution {
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Helper method to convert "MM-DD" to day of the year (1 to 365)
    private int calculateDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += DAYS_IN_MONTH[i];
        }
        return totalDays;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceArrival = calculateDayOfYear(arriveAlice);
        int aliceLeave = calculateDayOfYear(leaveAlice);
        int bobArrival = calculateDayOfYear(arriveBob);
        int bobLeave = calculateDayOfYear(leaveBob);

        // Overlap start aur end calculate karo
        int startOverlap = Math.max(aliceArrival, bobArrival);
        int endOverlap = Math.min(aliceLeave, bobLeave);

        // Agar overlap valid hai toh total days return karo, nahi toh 0
        if (startOverlap <= endOverlap) {
            return (endOverlap - startOverlap) + 1;
        }
        
        return 0;
        
    }
}