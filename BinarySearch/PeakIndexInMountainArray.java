package BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2 , 7 , 9 , 12 , 45 , 78};
        int peak = peakIndex(arr);
        System.out.println(peak);

        
    }

    static int peakIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left  + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; //increase slope if peak is in the right side
            } else {
                right = mid; //decrease slope if peak is in the left side or mid is the peak
            }

        }
        return left;
    }
    
}
