class Solution {
    public int sumSubarrayMins(int[] arr) {
        //int ans=0;
        long mod=1000000007;
        int n=arr.length;
        long max=0;
        if(arr.length==1) return arr[0];
        int[] left=new int[n];
        int[] right=new int[n];
        int min=arr[0];
        int ixd=0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                ixd=i;
            }
            max+=arr[i];
        }
        //max+=min;
        Stack<Integer> stk=new Stack<>();
        left[0]=-99;
        stk.push(0);
        for(int i=1;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()) left[i]=-99;
            else left[i]=stk.peek();
            stk.push(i);
        }
        while(!stk.isEmpty()) stk.pop();
        right[n-1]=-99;
        stk.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()) right[i]=-99;
            else right[i]=stk.peek();
            stk.push(i);
        }
        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        for(int i=0;i<n;i++){
            long t1=(left[i]==-99)?i:i-left[i]-1;
            long t2=(right[i]==-99)?n-i-1:right[i]-i-1;
            long t3=t1*t2;
            //System.out.println(t1+" "+t2+" "+c);
            max=(max+arr[i]*(t1+t2+t3))%mod;
            //System.out.println(max);
        }
        //if(ixd==0 || ixd==n-1) max-=min;
        max=max%mod;
        return (int)max;
    }
}