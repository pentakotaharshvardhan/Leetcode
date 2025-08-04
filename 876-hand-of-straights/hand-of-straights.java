class Solution {
    public boolean isNStraightHand(int[] hand, int k) {
        int n=hand.length;
        if(n%k!=0) return false;
        if(n==1) return true;
        int len=0;
        Arrays.sort(hand);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(hand[i])) len++;
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }
        //if(len==k) return true;
        //int num=hand[0];
        // int i=;
        // for(i<)
        //System.out.println(hm+" "+len);
        for(int j=0;j<hand.length;j++){
            int num=hand[j];
            if(hm.get(num)<=0) continue;
            //System.out.println(num+" "+(num+k-1));
            if(!hm.containsKey(num+k-1)) return false;
            int m=hm.get(num);
            for(int i=num;i<=num+k-1;i++){
                if(!hm.containsKey(i)) return false;
                hm.put(i,hm.get(i)-m);
            }
            //System.out.println(hm);
        }
        //System.out.println(hm);
        for(int s:hm.keySet()){
            if(hm.get(s)!=0) return false;
        }
        return true;

    }
}