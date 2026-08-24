class Solution {
    public int[] searchRange(int[] arr, int target) {

        int n = arr.length;
        int[] ans = {-1, -1};

        // First occurrence
        int i = 0;
        int j = n - 1;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            if(arr[mid] == target) {
                ans[0] = mid;
                j = mid - 1;       // left side search
            }
            else if(arr[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        // Last occurrence
        i = 0;
        j = n - 1;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            if(arr[mid] == target) {
                ans[1] = mid;
                i = mid + 1;       // right side search
            }
            else if(arr[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        return ans;
    }
}