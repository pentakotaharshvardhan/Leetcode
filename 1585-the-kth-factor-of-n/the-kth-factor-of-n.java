class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) arr.add(i);
        } 
        int m=arr.size();
        for(int i=m-1;i>=0;i--){
            if(n/arr.get(i)!=arr.get(i)){
                arr.add(n/arr.get(i));
            }
        }
        System.out.println(arr);
        if(arr.size()>=k) return arr.get(k-1);
        return -1;
    }
}