class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long s = (long) num1 - (long) k * num2;
            if (s < 0) break;
            //if question aksed the can a number be divided or add in k parts then 
            // use this bitCount(s)<=k means it can be done in k steps
            if (s >= k && Long.bitCount(s) <= k) {
                return k;
            }
        }
        return -1;
    }
}
