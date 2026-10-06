class Solution {
    public long maxAlternatingSum(int[] nums) {
        final long NEG = Long.MIN_VALUE / 2;
        long ans = NEG, plus = NEG, minus = NEG, plusDel = NEG, minusDel = NEG;
        for (long x : nums) {
            long p = Math.max(x, minus + x);  
            long m = plus - x; 
            long pd = Math.max(minusDel + x, plus);  
            long md = Math.max(plusDel - x, minus);  
            plus = p; minus = m; plusDel = pd; minusDel = md;
            ans = Math.max(ans, Math.max(Math.max(plus, minus), Math.max(plusDel, minusDel)));
        }
        return ans;
    }
}