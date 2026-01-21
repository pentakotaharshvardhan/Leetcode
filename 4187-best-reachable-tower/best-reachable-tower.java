class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(towers[a][2]<towers[b][2]) return 1;
            else if(towers[a][2]>towers[b][2]) return -1;
            else{
                if(towers[a][0]==towers[b][0]) return towers[a][1]-towers[b][1];
                else return towers[a][0]-towers[b][0];
            }
        });
        for(int i=0;i<towers.length;i++){
            int temp=Math.abs(towers[i][0]-center[0])+Math.abs(towers[i][1]-center[1]);
            if(temp<=radius) pq.add(i);
        }
        if(pq.isEmpty()) return new int[]{-1,-1};
        int ixd=pq.peek();
        return new int[]{towers[ixd][0],towers[ixd][1]};
    }
}