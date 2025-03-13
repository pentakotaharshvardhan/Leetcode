class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int max=0;
        for(int i:barcodes){
            max=Math.max(max,i);
        }
        if(barcodes.length<=1) return barcodes;
        int[] ans=new int[barcodes.length];
        int[] val=new int[max+1];
        for(int i:barcodes){
            val[i]+=1;
        }
        PriorityQueue<Integer> pr=new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Integer a,Integer b){
                if(val[a]<val[b]) return 1;
                else if(val[a]>val[b]) return -1;
                else return 0;
            }
        });
        for(int i=1;i<val.length;i++){
            pr.add(i);
        }
        int count=0;
        while(count<barcodes.length){
            int a=pr.poll();
            int b=pr.poll();
            if(count==0 || ans[count-1]!=a){
                ans[count++]=a;
                val[a]-=1;
                pr.add(a);
                pr.add(b);
            }
            else{
                ans[count++]=b;
                val[b]-=1;
                pr.add(a);
                pr.add(b);
            }
        }
        return ans;
    }
}