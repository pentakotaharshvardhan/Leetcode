class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] arr=new int[26];
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()) arr[(int)(ch-'a')]++;
        boolean istrue=true;
        for(int m=0;m<target.length();m++){
            char ch=target.charAt(m);
            int i=(int)(ch-'a');
            if(arr[i]!=0){
                str.append(ch+"");
                arr[i]--;
            }
            else{
                for(int j=i;j>=0;j--){
                    if(arr[j]!=0){
                        str.append((char)('a'+j)+"");
                        arr[j]--;
                        istrue=false;
                        break;
                    }
                }
                break;
            }
        }
        if(str.length()!=target.length()){
            if(!istrue){
                for(int i=25;i>=0;i--){
                    if(arr[i]!=0){
                        while(arr[i]!=0){
                            str.append((char)('a'+i)+"");
                            arr[i]--;
                        }
                    }
                }
            }
            else{
                boolean r=str.length()==0?true:false;
                for(int i=0;i<26;i++){
                    if(arr[i]!=0){
                        while(arr[i]!=0){
                            str.append((char)('a'+i)+"");
                            arr[i]--;
                        }
                    }
                }
                if(r) return str.toString();
            }
        }
        if(str.toString().compareTo(target)>0) return str.toString();
        System.out.println(str);
        String ans=nextPermutation(str.toString());
        return ans.compareTo(target)<=0?"":ans;
    }
    public String nextPermutation(String s){
        char[] ch=s.toCharArray();
        int[] nums=new int[s.length()];
        for(int i=0;i<ch.length;i++){
            nums[i]=(int)(ch[i]-'a');
        }
        int ind1=-1;
        int ind2=-1; 
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(nums,0);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }
            int temp=nums[ind1];
            nums[ind1]=nums[ind2];
            nums[ind2]=temp;
            reverse(nums,ind1+1);
        }
        StringBuilder ans=new StringBuilder();
        for(int k=0;k<nums.length;k++) ans.append((char)(nums[k]+'a')+"");
        System.out.println(ans);
        return ans.toString();
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}