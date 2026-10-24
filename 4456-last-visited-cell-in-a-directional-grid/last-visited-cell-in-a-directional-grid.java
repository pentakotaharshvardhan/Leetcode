class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int x=0;
        int m=grid.length;
        int n=grid[0].length;
        int y=0;
        HashSet<String> hs=new HashSet<>();
        hs.add("0@0");
        while(x<m && y<n){
                char ch=grid[x][y];
                if(ch=='L'){
                    String s=x+"@"+(y-1);
                    if(y==0 || hs.contains(s)) return new int[]{x,y};
                    else{
                        y-=1;
                        hs.add(s);
                    }
                }
                if(ch=='R'){
                    String s=x+"@"+(y+1);
                    if(y==n-1 || hs.contains(s)) return new int[]{x,y};
                    else{
                        y+=1;
                        hs.add(s);
                    } 
                }
                if(ch=='U'){
                    String s=(x-1)+"@"+y;
                    //System.out.println(s);
                    if(x==0 || hs.contains(s)) return new int[]{x,y};
                    else{
                        x-=1;
                        hs.add(s);
                    } 
                }
                if(ch=='D'){
                    String s=(x+1)+"@"+y;
                    if(x==m-1 || hs.contains(s)) return new int[]{x,y};
                    else{
                        x+=1;
                        hs.add(s);
                    }  
                }
                //System.out.println(x+" "+y);
            }
        return new int[]{x,y};
    }
}