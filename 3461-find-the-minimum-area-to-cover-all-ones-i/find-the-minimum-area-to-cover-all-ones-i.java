class Solution {
    public int minimumArea(int[][] grid) {
        int height=0;
        int width=0;
        int hStart=0;
        int wStart=0;
        boolean istrue=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(!istrue){
                        wStart=j;
                        istrue=true;
                    }
                    if(istrue && wStart>j){
                        //System.out.println("*");
                        wStart=j;
                    }
                    if(width<j) width=j;
                }
            }
        }
        istrue=false;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    if(!istrue){
                        hStart=j;
                        istrue=true;
                    }
                    //System.out.println(hStart>j);
                    if(istrue && hStart>j){
                        hStart=j;
                    }
                    if(height<j) height=j;
                }
            }
        }
        //System.out.println(hStart+" "+wStart);
        //System.out.println(height+" "+width);
        return (height-hStart+1)*(width-wStart+1);
    }
}