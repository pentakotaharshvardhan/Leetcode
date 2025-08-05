class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        boolean[] basket=new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j] && !basket[j]) {
                    basket[j]=true;
                    count++;
                    break;
                }
            }
        }
        return fruits.length-count;
    }
}