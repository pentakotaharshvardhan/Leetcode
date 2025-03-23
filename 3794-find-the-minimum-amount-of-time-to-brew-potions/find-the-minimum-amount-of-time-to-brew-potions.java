class Solution {
    static{
        for(int i=0;i<500;i++){
            minTime(new int[]{0},new int[]{0});
        }
    }
    public static long minTime(int[] skill, int[] mana) {
        long ans=0;
        long[][] table=new long[mana.length][skill.length];
        int count=0;
        long start=0;
        long end=0;
        while(count!=mana.length){
            long[] intervals=new long[skill.length];
            for(int i=0;i<skill.length;i++){
                intervals[i]=skill[i]*mana[count];
            }
            if(count!=0){
                start=table[count-1][0];
                end=ans;
                while(start<=end){
                    long mid=start+(end-start)/2;
                    if(isgroup(mid,table,intervals,count)){
                        end=mid-1;
                    }
                    else start=mid+1;
                }
            }
            //System.out.println(start);
            //start=end;
            for(int i=0;i<skill.length;i++){
                if(i==0) table[count][0]=start+intervals[0];
                else table[count][i]=table[count][i-1]+intervals[i];
            }
            ans=table[count][skill.length-1];
            count++;
        }
        return ans;
    }
    static boolean isgroup(long mid,long[][] table ,long[] intervals,int count){
        long a=mid;
        if(a<table[count-1][0]) return false;
        for(int i=0;i<intervals.length-1;i++){
            a+=intervals[i];
            if(a<table[count-1][i+1]) return false;
        }
        return true;
    }
}