class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPower = modPow(5, evenCount);
        long oddPower = modPow(4, oddCount);

        return (int) ((evenPower * oddPower) % MOD);
    }

    private long modPow(long base, long exp) {
        if (exp == 0) return 1;

        long half = modPow(base, exp / 2);
        long result = (half * half) % MOD;

        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}
