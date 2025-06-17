class Solution {
    final long MOD = (long)1e9 + 7;
    long[] fact;
    long[] invFact;

    public int countGoodArrays(int n, int m, int k) {
        precomputeFactorials(n);

        long comb = C(n - 1, n - k - 1);
        long pow = modPow(m - 1, n - k - 1);
        long ans = (comb * m) % MOD;
        ans = (ans * pow) % MOD;

        return (int) ans;
    }

    public void precomputeFactorials(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = invFact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        invFact[n] = modPow(fact[n], MOD - 2);
        for (int i = n - 1; i >= 1; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }
    public long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
    public long C(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (((fact[n] * invFact[k]) % MOD) * invFact[n - k]) % MOD;
    }
}
