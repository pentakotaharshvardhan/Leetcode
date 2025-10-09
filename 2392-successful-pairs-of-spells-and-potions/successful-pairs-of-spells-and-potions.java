class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int a=spells[i];
            int s=binarySearch(potions,a,success);
            if((long)potions[s]*a<success) s=potions.length;
            ls.add(potions.length-s);
        }
        int[] ans=new int[ls.size()];
        int k=0;
        for(int i:ls) ans[k++]=i;
        return ans;
    }
    public int binarySearch(int[] arr,int a,long target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<end){
            mid=start-(start-end)/2;
            if((long)arr[mid]*a>=target) end=mid;
            else start=mid+1;
        }
        return end;
    }
}