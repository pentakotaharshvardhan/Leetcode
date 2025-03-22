class Solution {
    static{
        arrayRankTransform(new int[]{0});
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] temp=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int count=1;
        for(int i=0;i<temp.length;i++){
            if(!hm.containsKey(temp[i])){
                if(i>0 && temp[i]!=temp[i-1]){
                    hm.put(temp[i],++count);
                }
                else hm.put(temp[i],count);
            }
        }
        //System.out.println(Arrays.toString(arr)+" "+Arrays.toString(temp));
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                arr[i]=hm.get(arr[i]);
            }
        }
        return arr;
    }
}