package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-2 , 4, 6, 7, 67, 78 , 99};
        int target = 7;
        int ans = bianrySearch(nums, target);
        System.out.println(ans);
        
    }
    public static int bianrySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= target) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
        }
        return -1; //if target does not exist;
    }

}