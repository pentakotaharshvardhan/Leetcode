class Solution {
    public int sortPermutation(int[] arr) {
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=i){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        if(list.size()==0)return 0;
        int ans=list.get(0);
        for(int i=1;i<list.size();i++){
            ans=ans&list.get(i);
        }
        return ans;
    }
}