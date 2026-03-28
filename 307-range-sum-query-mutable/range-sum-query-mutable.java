class NumArray {
    static int blockSize;
    static int[] arr;
    static int[] blockSum;
    public NumArray(int[] nums) {
        int n=nums.length;
        blockSize=(int)Math.sqrt(n)+1;
        arr=nums;
        blockSum=new int[blockSize];

        for(int i=0;i<n;i++){
            blockSum[i/blockSize]+=arr[i];
        }
    }
    
    public void update(int index, int val) {
        blockSum[index/blockSize]+=val-arr[index];
        arr[index]=val;
    }
    
    public int sumRange(int left, int right) {
        int s=left/blockSize;
        int e=right/blockSize;
        int sum=0;
        if(s==e){
            for(int i=left;i<=right;i++){
                sum+=arr[i];
            }
        }
        else{
            for(int i=left;i<(s+1)*blockSize;i++){
                sum+=arr[i];
            }
            for(int i=s+1;i<e;i++){
                sum+=blockSum[i];
            }
            for(int i=e*blockSize;i<=right;i++){
                sum+=arr[i];
            }
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */