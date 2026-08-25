class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int max = 0;

        // Maximum pile find karo
        for(int a = 0; a < n; a++) {
            max = Math.max(max, piles[a]);
        }

        int i = 1;
        int j = max;

        int ans = max;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            long hours = 0;

            for(int a = 0; a < n; a++) {
                hours += (piles[a] + mid - 1) / mid;
            }

            if(hours <= h) {

                // Speed possible hai
                ans = mid;
                j = mid - 1;
            }
            else {

                // Speed slow hai
                i = mid + 1;
            }
        }

        return ans;
    }
}