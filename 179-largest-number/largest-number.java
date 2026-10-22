class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = String.valueOf(nums[i]);
        }


        // Step 2: Sort strings using Custom Comparator
        // Compare (b + a) with (a + b) for descending order
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        if (strs[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
        sb.append(str);
        }
        return sb.toString();
    }
}