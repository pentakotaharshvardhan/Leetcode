class Solution {
    public boolean isPowerOfFour(int n) {
        double check=Math.log(n)/Math.log(4);
        return check%1 <0.00000000000001;
    }
}