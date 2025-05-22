class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hm=new HashSet<>();
        //Integer a[] = Arrays.stream(digits).boxed().toArray(Integer[]::new);
        //Arrays.sort(a, Collections.reverseOrder());
        //System.out.println(Arrays.toString(a));
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(j==k || k==i) continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num%2==0 && num>99) hm.add(num);
                }
            }
        }
        int[] ans=new int[hm.size()];
        int j=0;
        for(int i:hm){
            ans[j++]=i;
        }
        Arrays.sort(ans);
        return ans;
    }
}