class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low+(high-low)/2;

             // 'mid <= x / mid' is same as 'mid * mid <= x'
            if (mid <= x / mid) {
                // Agar mid * mid <= x hai, toh mid ek valid candidate hai
                ans = mid;

                // Aur bade candidate ki talash mein right half check karo
                low = mid + 1;
            } else {
                // Agar mid * mid > x ho gaya, matlab mid bohot bada number hai
                // Toh smaller candidates ke liye left half check karo
                high = mid - 1;
            }

        
        
        }

        return ans;
    }
}