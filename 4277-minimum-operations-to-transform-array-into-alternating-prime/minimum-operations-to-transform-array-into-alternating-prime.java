class Solution {

    private static final int LIMIT = 150000;
    private static final List<Integer> prime = getPrime(LIMIT);

    private static List<Integer> getPrime(int n) {
        boolean[] composite = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!composite[i]) {
                list.add(i);

                if ((long) i * i <= n) {
                    for (long j = (long) i * i; j <= n; j += i) {
                        composite[(int) j] = true;
                    }
                }
            }
        }

        return list;
    }

    public int minOperations(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int nextPrime = lowerBoundPrime(nums[i]);

            if (i % 2 != 0) {
                if (nums[i] == 2) {
                    ans += 2;
                } else if (nums[i] == nextPrime) {
                    ans += 1;
                }
                continue;
            }

            ans += nextPrime - nums[i];
        }

        return ans;
    }

    private int lowerBoundPrime(int target) {
        int start = 0;
        int end = prime.size() - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (prime.get(mid) >= target) {
                ans = prime.get(mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}