import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] num1 = new BigInteger[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num1[i] = new BigInteger(nums[i]);
        }
        Arrays.sort(num1);
        return num1[num1.length - k].toString();
    }
}