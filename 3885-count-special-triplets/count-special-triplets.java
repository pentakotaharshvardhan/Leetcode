class Solution {
    public int specialTriplets(int[] nums) {
         int mod = (int)1e9+7;
        int n = nums.length;
        long result = 0;
        Map<Integer, Integer> rightFreq = new HashMap<>();
        for (int num : nums) {
            rightFreq.put(num, rightFreq.getOrDefault(num, 0) + 1);
        }
         Map<Integer, Integer> leftFreq = new HashMap<>();
        for (int j = 0; j < n; j++) {
            int num = nums[j];
            rightFreq.put(num, rightFreq.get(num) - 1);
            if (rightFreq.get(num) == 0) {
                rightFreq.remove(num);
            }
            int target = num * 2;
            int countLeft = leftFreq.getOrDefault(target, 0);
            int countRight = rightFreq.getOrDefault(target, 0);
            result = (result + ((long) countLeft * countRight) % mod) % mod;
            leftFreq.put(num, leftFreq.getOrDefault(num, 0) + 1);
            //System.out.println(leftFreq+" "+rightFreq);
        }
        return (int) result;
    }
}