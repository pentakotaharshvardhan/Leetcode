class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes = new HashSet<>();
        
        for (int num : nums) {
            int n = num;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0 && isPrime(i)) {
                    primes.add(i);
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n > 1) primes.add(n); // remaining prime factor
        }

        return primes.size();
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
