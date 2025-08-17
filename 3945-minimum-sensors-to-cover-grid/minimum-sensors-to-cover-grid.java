class Solution {
    public int minSensors(int n, int m, int k) {
        int total=n*m;
        int num=2*k +1;
        int row=(n%num==0)?n/num:n/num+1;
        int col=(m%num==0)?m/num:m/num+1;
        return row*col;
    }
}