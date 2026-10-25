class Solution {
    public int maxSum(int[] nums) {
        // Tracks the largest number seen so far for each max digit (0-9)
        int[] maxValForDigit = new int[10];
        int maxSum = -1;

        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            
            if (maxValForDigit[maxDigit] > 0) {

                maxSum = Math.max(maxSum, num + maxValForDigit[maxDigit]);
            }

            maxValForDigit[maxDigit] = Math.max(maxValForDigit[maxDigit], num);
        }
        return maxSum;
    }

    private int getMaxDigit(int num) {
        int maxD = 0;
        while (num > 0) {
            maxD = Math.max(maxD, num % 10);
            num /= 10;
        }
        return maxD;
    }
}
