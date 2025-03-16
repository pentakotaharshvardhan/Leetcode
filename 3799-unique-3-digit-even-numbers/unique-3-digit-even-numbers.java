class Solution {
    public int totalNumbers(int[] digits) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<digits.length;i++){
            //if(digits[i]%2!=0 || digits[i]==0) continue;
            if(i>0 &&digits[i]==digits[i-1]) continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(k==j || k==i) continue;
                    if(digits[k]%2==0){
                        int dig=digits[i]*100+digits[j]*10+digits[k];
                        if(dig>=100 && !hm.containsKey(dig)) hm.put(dig,0);
                        System.out.println(digits[i]+" "+digits[j]+" "+digits[k]);
                    }
                }
            }
        }
        return hm.size();
    }
}