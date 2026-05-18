class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        //int[] nums=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(!hm.containsKey(arr[i])){
                List<Integer> ls=new ArrayList<>();
                ls.add(i);
                hm.put(arr[i],ls);
            }
            else{
                List<Integer> ls=hm.get(arr[i]);
                ls.add(i);
                hm.put(arr[i],ls);
            }
        }
        Queue<Integer> pq=new LinkedList<>();
        boolean[] istrue=new boolean[arr.length];
        pq.add(0);
        int ans=0;
        while(!pq.isEmpty()){
            ans++;
            boolean is=false;
            int s=pq.size();
            for(int i=0;i<s;i++){
                int ixd=pq.poll();
                if(ixd==arr.length-1){
                    is=true;
                    break;
                }
                istrue[ixd]=true;
                if(ixd+1<arr.length && !istrue[ixd+1]) pq.add(ixd+1);
                if(ixd-1>=0 && !istrue[ixd-1]) pq.add(ixd-1);
                if(hm.containsKey(arr[ixd])){
                    List<Integer> t1=hm.get(arr[ixd]);
                    for(int j=0;j<t1.size();j++){
                        if(!istrue[t1.get(j)]) pq.add(t1.get(j));
                    }
                    hm.remove(arr[ixd]);
                }
            }
            if(is) break;
        }
        return ans-1;
    }
}