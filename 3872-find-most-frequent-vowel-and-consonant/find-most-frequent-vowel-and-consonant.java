class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hm1=new HashMap<>();
        int maxa=0;
        int maxb=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
            else{
                hm1.put(c,hm1.getOrDefault(c,0)+1);
            }
        }
        for(char i:hm.keySet()){
            maxa=Math.max(maxa,(int)hm.get(i));
        }
        for(char i:hm1.keySet()){
            maxb=Math.max(maxb,(int)hm1.get(i));
        }
        return maxa+maxb;
    }
}