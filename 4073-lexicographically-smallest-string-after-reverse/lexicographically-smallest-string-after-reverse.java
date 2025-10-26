class Solution {
    public String lexSmallest(String s) {
        int n=s.length();
        String ans=s;
        for(int i=0;i<n;i++){
            StringBuilder front=new StringBuilder(s.substring(0,i+1));
            front.reverse();
            String t1=front.toString();
            if(i+1<n) t1=t1+s.substring(i+1,n);
            //System.out.println(t1);
            if(i==1) ans=t1;
            else if(t1.compareTo(ans)<1) ans=t1; 
        }
        for(int i=0;i<n;i++){
            StringBuilder back=new StringBuilder(s.substring(i,n));
            back.reverse();
            String t1=back.toString();
            if(i>0) t1=s.substring(0,i)+t1;
            //System.out.println(t1);
            if(t1.compareTo(ans)<1) ans=t1; 
        }
        return ans;
    }
}