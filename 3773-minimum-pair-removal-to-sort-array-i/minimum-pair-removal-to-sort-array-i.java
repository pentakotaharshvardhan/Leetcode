class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(isdesc(list)){
            int idx=0;
            int min=Integer.MAX_VALUE;
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(min>sum){
                    min=sum;
                    idx=i;
                } 
            }
            for(int i=0;i<idx;i++){
                ls.add(list.get(i));
            }
            ls.add(min);
            for(int i=idx+2;i<list.size();i++){
                ls.add(list.get(i));
            }
            System.out.println(ls);
            list.clear();
            list=ls;
            ans++;
        }
        return ans;
    }
    public static boolean isdesc(List<Integer> list){
        boolean istrue=false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)) istrue=true;
        }
        return istrue;
    }
}