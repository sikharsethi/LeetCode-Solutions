class Solution {
    public int findClosestNumber(int[] nums) {
       int closest = nums[0];

       for (int num: nums) {
        int currentDistance = Math.abs(num);
        int closestDistance = Math.abs(closest);

        if (currentDistance < closestDistance) {
            closest = num;
        } else if (currentDistance == closestDistance) {
            closest = Math.max(closest, num);
        }
       } 

       return closest;
    }
}