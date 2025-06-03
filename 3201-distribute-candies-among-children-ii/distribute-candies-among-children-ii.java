class Solution {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        long[] arr = {1, -3, 3, -1}; 

        for (int i = 0; i <= 3; i++) {
            long var1 = n - i * (limit + 1) + 2;
            long var2 = 2;

            if (var1 >= 0) {
                ans += arr[i] * C(var1, var2);
            }
        }

        return Math.max(ans, 0);
    }

    public static long C(long n, long k) {
        if (k < 0 || n < 0 || k > n) return 0;
        long res = 1;
        for (long i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}