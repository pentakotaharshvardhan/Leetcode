class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            int t1=x;
            int t2=y;
            List<Integer> arr=new ArrayList<>();
            while(t1<n && t2<m){
                arr.add(grid[t1++][t2++]);
            }
            Collections.sort(arr,(a,b)->b-a);
            t1=x;
            t2=y;
            int k=0;
            while(t1<n && t2<m){
                ans[t1++][t2++]=arr.get(k++);
            }
            x++;
        }
        if(m<2) return ans;
        y=1;
        x=0;
        for(int i=0;i<m-1;i++){
            int t1=x;
            int t2=y;
            List<Integer> arr=new ArrayList<>();
            while(t1<n && t2<m){
                arr.add(grid[t1++][t2++]);
            }
            Collections.sort(arr);
            t1=x;
            t2=y;
            int k=0;
            while(t1<n && t2<m){
                ans[t1++][t2++]=arr.get(k++);
            }
            y++;
        }
        return ans;
    }
}