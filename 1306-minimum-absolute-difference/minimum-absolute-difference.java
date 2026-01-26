class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            min=Math.min(min,arr[i]-arr[i-1]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> ls=new ArrayList<>();
                ls.add(arr[i]);
                ls.add(arr[i+1]);
                ans.add(ls);
            }
        }
        return ans;
    }
}