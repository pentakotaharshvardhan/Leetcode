class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = costs[i];
            nums[i][1] = capacity[i];
        }
        Arrays.sort(nums, (x, y) -> x[0] - y[0]);
        int[] arr = new int[n];
        arr[0] = nums[0][1];
        for (int i = 1; i < n; i++) {
            arr[i] = Math.max(arr[i - 1], nums[i][1]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i][0] < budget) {
                ans = Math.max(ans, nums[i][1]);
            }
        }
        for (int j = 1; j < n; j++) {
            int rem=budget-nums[j][0] - 1;
            int i=binarySearch(nums, rem, j - 1);
            if (i>= 0){
                ans = Math.max(ans,arr[i]+nums[j][1]);
            }
        }
        return ans;
    }

    private int binarySearch(int[][] a, int val, int end) {
        int s=0;
        int e=end;
        int ans= -1;
        while (s<=e) {
            int m = s+(e-s)/2;
            if (a[m][0] <= val) {
                ans = m;
                s= m + 1;
            } else {
                e= m - 1;
            }
        }
        return ans;
    }
}