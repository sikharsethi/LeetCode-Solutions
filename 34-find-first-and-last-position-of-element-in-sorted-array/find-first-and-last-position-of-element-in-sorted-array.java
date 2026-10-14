class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }

        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[]{first, last};

    }

    private int findPosition(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int pos = -1;

        while (left <= right) {
            // Fix 2: Correct midpoint formula to prevent overflow/out-of-bounds
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                pos = mid;
                if (findFirst) {
                    right = mid - 1; // Look left for first occurrence
                } else {
                    left = mid + 1;  // Look right for last occurrence
                }
            // Fix 3: Use strict < instead of <= to keep logic clean
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return pos;
    }
}