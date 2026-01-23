class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int a=1;
        int b=1;
        int temp=2;
        int prev=hBars[0];
        for(int i=1;i<hBars.length;i++){
            //System.out.println(prev+" "+(hBars[i]-1));
            if(prev==(hBars[i]-1)) temp++;
            else{
                a=Math.max(a,temp);
                temp=2;
            }
            prev=hBars[i];
        }
        a=Math.max(a,temp);
        //System.out.println(a);
        prev=vBars[0];
        temp=2;
        for(int i=1;i<vBars.length;i++){
            if(prev==(vBars[i]-1)) temp++;
            else{
                b=Math.max(b,temp);
                temp=2;
            }
            prev=vBars[i];
        }
        b=Math.max(b,temp);
        return Math.min(a,b)*Math.min(a,b);
    }
}