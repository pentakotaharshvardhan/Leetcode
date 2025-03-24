class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans=new int[k];
        int mid=(arr.length-1)/2;
        int val=arr[mid];
        Integer[] arr1=new Integer[arr.length];
        int j=0;
        for(int x:arr){
            arr1[j++]=x;
        }
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int val1 = Math.abs(a - val);
                int val2 = Math.abs(b - val);
                if (val1 < val2) return 1;
                else if (val1 > val2) return -1;
                else return Integer.compare(b, a); 
            }
        });

        //System.out.println(Arrays.toString(arr1));
        for(int i=0;i<k;i++){
            ans[i]=arr1[i];
        }
        return ans;
    }
}