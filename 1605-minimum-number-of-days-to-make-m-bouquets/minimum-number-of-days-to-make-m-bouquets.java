class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Total flowers required
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int num : bloomDay) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        int ans = -1;

        // Binary Search on days
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;
            int bouquets = 0;

            // Check if m bouquets can be made by mid day
            for (int num : bloomDay) {

                if (num <= mid) {
                    count++;

                    // k adjacent flowers make one bouquet
                    if (count == k) {
                        bouquets++;
                        count = 0;
                    }
                } else {
                    // Adjacency breaks
                    count = 0;
                }
            }

            if (bouquets >= m) {
                // Possible, try smaller day
                ans = mid;
                high = mid - 1;
            } else {
                // Not possible, need more days
                low = mid + 1;
            }
        }

        return ans;
    }
}