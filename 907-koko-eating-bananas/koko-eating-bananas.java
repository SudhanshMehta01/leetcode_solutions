class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        // Maximum pile find karna
        int max = 0;

        for(int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }

        // Eating speed ki range: 1 to max
        int i = 1;
        int j = max;

        int ans = max;

        while(i <= j) {

            // Current possible eating speed
            int mid = i + (j - i) / 2;

            long hours = 0;

            // Is speed par total kitne hours lagenge
            for(int a = 0; a < n; a++) {
                hours += (long)Math.ceil((double)piles[a] / mid);
            }

            if(hours <= h) {

                // Ye speed possible hai
                ans = mid;

                // Aur kam speed try karo
                j = mid - 1;
            }
            else {

                // Speed bahut slow hai
                i = mid + 1;
            }
        }

        return ans;
    }
}