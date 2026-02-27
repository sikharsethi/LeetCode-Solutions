package BinarySearch;
class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {4 , 8 , 12 , 89 , 45 , 54 , 65};
        int peak = peakElement(nums);
        System.out.println(peak);
        
    }

    static int peakElement(int[]nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) /2;
            
            if(nums[mid] < nums[mid + 1]) {
                left = mid + 1; //increase slope if peak is in the right side
            }else{
                right = mid; //decrease slope if peak is in the left side or mid is the peak
            }
        }
        return left;
    }

}