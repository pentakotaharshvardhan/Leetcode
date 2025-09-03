class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(i);
        }
        Collections.sort(ls,(a,b)->{
            if(points[a][0]<points[b][0]) return -1;
            else if(points[a][0]==points[b][0]) return points[b][1]-points[a][1];
            return 1;
        });
        int count=0;
        System.out.println(ls);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x=ls.get(i);
                int y=ls.get(j);
                // if(points[x][0]==points[y][0] || points[x][1]==points[y][1]){
                //     //System.out.println("*");
                //     count++;
                //     continue;
                // }
                if(points[x][1]<points[y][1]) continue;
                boolean istrue=true;
                for(int k=i+1;istrue && k<j;k++){
                    int k1=ls.get(k);
                    //System.out.println(k1);
                    istrue=check(points,x,y,k1);
                }
                if(istrue){
                    count++;
                    //System.out.println(x+" "+y);
                } 
            }
        }
        return count;
    }
    public boolean check(int[][] points,int i,int j,int k){
        if (points[k][0] >= Math.min(points[i][0], points[j][0]) &&
        points[k][0] <= Math.max(points[i][0], points[j][0]) &&
        points[k][1] >= Math.min(points[i][1], points[j][1]) &&
        points[k][1] <= Math.max(points[i][1], points[j][1])) {
            //System.out.println("*");
            return false;
        }
        return true;
    }
}