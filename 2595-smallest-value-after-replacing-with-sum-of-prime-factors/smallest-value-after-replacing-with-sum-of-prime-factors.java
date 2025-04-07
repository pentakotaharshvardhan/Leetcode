class Solution {
    public int smallestValue(int n) {
        int ans=n;
        while(true){
            int temp=sumFactors(ans);
            if(ans<=temp) break;
            ans=temp;
        }
        return ans;
    }
    public static int sumFactors(int n){
        int sumfact=0;
        int temp=n;
        while(!isPrime(temp)){
            //System.out.println("hello");
            for(int i=2;i<temp;i++){
                if(isPrime(i) && temp%i==0){
                    //System.out.println(i);
                    sumfact+=i;
                    temp=temp/i;
                    break;
                }
            }
        }
        return sumfact==0? n+1: sumfact+temp;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}