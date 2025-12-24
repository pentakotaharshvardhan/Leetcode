class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int sum=0;
        for(int i:apple) sum+=i;
        for(int i:capacity) pq.add(i);
        int temp=0;
        while(temp<sum){
            temp+=pq.poll();
        }
        return capacity.length-pq.size();
    }
}