class Solution {
    public long countSubarrays(int[] arr, int k, int m) {
        long ans=0;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int j=0;
        long valid=0;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if((int)map.get(arr[i])==m)count++;
            while(j<=i && map.size()>k){
                int cnt=map.get(arr[j]);
                if(cnt==m)count--;
                cnt--;
                if(cnt>0)map.put(arr[j],cnt);
                else map.remove(arr[j]);
                j++;
                valid=0;
            }
            // System.out.println(map+" "+count);
            while((int)map.size()==count && count==k && map.get(arr[j])>m){
                valid++;
                int cnt=map.get(arr[j]);
                if(cnt==m)count--;
                cnt--;
                if(cnt>0)map.put(arr[j],cnt);
                else map.remove(arr[j]);
                j++;
            }
            if((int)map.size()==count && count==k){
                ans+=valid+1;
            }
        }
        return ans;
    }
}