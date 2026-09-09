class Solution {
    public long countCommas(long n) {

        if (n < 1000) {
            return 0;
        }

        long ans = 0;

        // 1,000 to 999,999
        if (n >= 1000) {
            long count = Math.min(n, 999999L) - 1000 + 1;
            ans += count;
        }

        // 1,000,000 to 999,999,999
        if (n >= 1000000) {
            long count = Math.min(n, 999999999L) - 1000000 + 1;
            ans += 2 * count;
        }

        // 1,000,000,000 to 999,999,999,999
        if (n >= 1000000000L) {
            long count = Math.min(n, 999999999999L)
                       - 1000000000L + 1;
            ans += 3 * count;
        }

        // 1,000,000,000,000 to 999,999,999,999,999
        if (n >= 1000000000000L) {
            long count = Math.min(n, 999999999999999L)
                       - 1000000000000L + 1;
            ans += 4 * count;
        }

        // 1,000,000,000,000,000 onwards
        if (n >= 1000000000000000L) {
            long count = n - 1000000000000000L + 1;
            ans += 5 * count;
        }

        return ans;
    }
}