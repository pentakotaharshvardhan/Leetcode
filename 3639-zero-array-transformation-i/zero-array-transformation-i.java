public class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        // Apply the difference array technique
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            diff[l]++;
            if (r + 1 < n) {
                diff[r + 1]--;
            }
        }

        // Calculate the prefix sum and validate
        int currentDecrement = 0;
        for (int i = 0; i < n; i++) {
            currentDecrement += diff[i];
            if (nums[i] > currentDecrement) {
                return false;
            }
        }

        return true;
    }
}
