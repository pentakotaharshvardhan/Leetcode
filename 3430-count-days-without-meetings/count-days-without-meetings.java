class Solution {
    public int countDays(int days, int[][] intervals) {
        int ans=0;
       List<Integer> list=new ArrayList<>();
        int[] arr=new int[intervals.length];
        int[] arr2=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            arr[i]=intervals[i][0];
            arr2[i]=intervals[i][1];
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i=0,j=0,start=arr[0],end=arr2[0];
        while(i<arr.length &&j<arr.length){
            if( arr[i]<=arr2[j]){
                i++;
            }
            if(i<arr.length &&arr[i]<=arr2[j]){
                j=i;
                end=arr2[j];
            }
            else{
                list.add(start);
                list.add(end);
                if(i>=arr.length){
                    break;
                }
                else {
                    j = j + 1;
                    start = arr[i];
                    end = arr2[j];
                }
            }
        }
        int[][] arr3=new int[list.size()/2][2];
        int m=0;
        for(int k=0;k<list.size()/2;k++){
            arr3[k][0]=(int)list.get(m++);
            arr3[k][1]=(int)list.get(m++);
            //System.out.println(arr3[k][0]+" "+arr3[k][1]);
        }
        for(int k=0;k<list.size()/2;k++){
            ans+=arr3[k][1]-arr3[k][0]+1;
        }
        return days-ans;
    }
}