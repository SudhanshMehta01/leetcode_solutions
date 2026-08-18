class Solution {
    public int specialArray(int[] arr) {

        int n = arr.length;

        // Har possible x ko check karo
        for(int x = 1; x <= n; x++) {

            int count = 0;

            // Count karo kitne elements >= x hain
            for(int i = 0; i < n; i++) {

                if(arr[i] >= x) {
                    count++;
                }
            }

            // Agar exactly x elements >= x hain
            if(count == x) {
                return x;
            }
        }

        // Koi special x nahi mila
        return -1;
    }
}