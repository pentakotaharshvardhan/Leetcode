import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minLength(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int l = 0, sum = 0, minlen = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            int countR = counts.getOrDefault(nums[r], 0);
            if (countR == 0) {
                sum += nums[r]; 
            }
            counts.put(nums[r], countR + 1);
            while (sum >= k) {
                minlen = Math.min(minlen, r - l + 1);
                int countL = counts.get(nums[l]);
                if (countL == 1) {
                    sum -= nums[l]; 
                }
                if (countL > 1) {
                    counts.put(nums[l], countL - 1);
                } else {
                    counts.remove(nums[l]);
                }
                l++;
            }
        }
        
        return (minlen == Integer.MAX_VALUE) ? -1 : minlen;
    }
}