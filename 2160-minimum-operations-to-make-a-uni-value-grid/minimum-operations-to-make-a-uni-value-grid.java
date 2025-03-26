class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> arr=new ArrayList<>();
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr.add(grid[i][j]);
            }
        }
        Collections.sort(arr);
        //System.out.println(arr);
        if(arr.size()%2==0){
            int temp=0;
            int mid=(arr.size()-1)/2;
            //System.out.println(mid);
            for(int i=0;i<arr.size();i++){
                int diff=Math.abs(arr.get(i)-arr.get(mid));
                //System.out.println(i+" "+diff);
                if(diff%x!=0){
                    temp=-1;
                    break;
                }
                temp+=diff/x;
                //System.out.println(temp);
            }
            if(ans<temp) ans=temp;
            for(int i=0;i<arr.size();i++){
                int diff=Math.abs(arr.get(i)-arr.get(mid+1));
                if(diff%x!=0){
                    temp=-1;
                    break;
                }
                temp+=diff/x;
            }
            if(ans==-1 || ans>temp) ans=temp;
        }
        else{
            int mid=(arr.size()-1)/2;
            for(int i=0;i<arr.size();i++){
                int diff=Math.abs(arr.get(i)-arr.get(mid));
                if(diff%x!=0) return -1;
                ans+=diff/x;
            }
        }
        return ans;
    }
}