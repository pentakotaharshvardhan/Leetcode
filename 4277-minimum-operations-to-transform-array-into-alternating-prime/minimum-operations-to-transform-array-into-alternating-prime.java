class Solution {
    public static List<Integer> getPrime(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] visi = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!visi[i]) {
                list.add(i);
                for (long j = (long) i * i; j <= n; j += i) visi[(int) j] = true;
            }
        }
        return list;
    }
    public List<Integer> prime=getPrime(150000);
    public int minOperations(int[] nums) {
        //System.out.println(prime);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int t1=binarySearch(prime,nums[i]);
            if(i%2!=0 ){
                if(nums[i]==2) ans+=2;
                else if(!(nums[i]!=t1))ans+=1;
                continue;
            }
            //System.out.println(nums[i]+" "+t1);
            ans+=(t1-nums[i]);
        }
        return ans;
    }
    public int binarySearch(List<Integer> prime,int target){
        int start=0;
        int end=prime.size();
        while(start<=end){
            int mid=end-(end-start)/2;
            if(prime.get(mid)==target) return prime.get(mid);
            else if(prime.get(mid)>target) end=mid-1;
            else start=mid+1;
        }
        return prime.get(start);
    }
}