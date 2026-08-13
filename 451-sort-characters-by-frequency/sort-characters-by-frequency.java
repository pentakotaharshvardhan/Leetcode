class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            if(hm.get(b)>hm.get(a)) return 1;
            else if(hm.get(b)<hm.get(a)) return -1;
            return a-b;
        });
        for(Character i:hm.keySet()){
            pq.add(i);
        }
        while(!pq.isEmpty()){
            Character ch=pq.poll();
            int temp=hm.get(ch);
            while(temp>0){
                str.append(ch+"");
                temp--;
            }
        }
        return str.toString();
    }
}