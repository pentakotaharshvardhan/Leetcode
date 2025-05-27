class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int i=n/m;
        for(int j=1;j<=i;j++){
            sum+=m*j;
        }
        System.out.println(sum);
        int s=(n*(n+1)/2)-sum;
        return s-sum;
    }
}