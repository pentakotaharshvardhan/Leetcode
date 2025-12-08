class Solution {
    public int countOdds(int low, int high) {
        if((high-low)%2==0) return (low%2!=0)?1+(high-low)/2:(high-low)/2;
        int temp=(high-low-1)/2;
        System.out.println(temp);
        if(high%2!=0) temp++; 
        return (low%2!=0)?1+temp:temp;
    }
}