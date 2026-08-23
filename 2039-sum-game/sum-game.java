class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int leftSum = 0;  int rightSum = 0;
        int leftCount = 0; int rightCount = 0;

        for (int i = 0; i < n/2; i++) {
            if (num.charAt(i) == '?') {
                leftCount++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = n/2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightCount++;
            } else{
                rightSum += num.charAt(i) - '0';
            }
        }

        if ((leftCount + rightCount) % 2 != 0) {
            return true;
        }

        return (leftSum - rightSum) != 9* (rightCount - leftCount) / 2;


    }
}