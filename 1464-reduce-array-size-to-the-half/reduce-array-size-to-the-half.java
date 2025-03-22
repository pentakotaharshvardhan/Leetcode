class Solution {
    static {
        minSetSize(new int[]{0});
    }
    public static int minSetSize(int[] arr) {
        int ans=0;
        int m=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        //System.out.println(hm);
        PriorityQueue<Integer> pr=new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Integer a,Integer b){
                if(a<b) return 1;
                else  return -1;
            }
        });
        for(int x:hm.keySet()){
            pr.add(hm.get(x));
        }
        //System.out.println(pr);
        while(!pr.isEmpty()){
            int n=pr.poll();
            m-=n;
           // System.out.println(n+" "+m);
            ans++;
            if(m<=arr.length/2) return ans;
        }
        return ans;
    }
}