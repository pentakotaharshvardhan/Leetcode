class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0) return true;
        Queue<Integer> pq=new LinkedList();
        boolean[] istrue=new boolean[arr.length];
        pq.add(start);
        while(!pq.isEmpty()){
            int ixd=pq.poll();
            istrue[ixd]=true;
            int pre=Math.max(-1,ixd-arr[ixd]);
            int nex=Math.min(arr.length,ixd+arr[ixd]);
            if(pre>-1 && arr[pre]==0) return true;
            else if(pre>-1 && !istrue[pre]) pq.add(pre); 
            if(nex<arr.length && arr[nex]==0) return true;
            else if(nex<arr.length && !istrue[nex]) pq.add(nex);

        }
        return false;
    }
}