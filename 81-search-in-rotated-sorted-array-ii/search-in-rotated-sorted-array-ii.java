class Solution {
    public boolean search(int[] arr, int tar) {

        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            if(arr[mid] == tar) {
                return true;
            }

            // Duplicate case
            if(arr[i] == arr[mid] && arr[mid] == arr[j]) {
                i++;
                j--;
                continue;
            }

            // Left half sorted
            if(arr[i] <= arr[mid]) {

                if(tar >= arr[i] && tar < arr[mid]) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }

            // Right half sorted
            else {

                if(tar > arr[mid] && tar <= arr[j]) {
                    i = mid + 1;
                }
                else {
                    j = mid - 1;
                }
            }
        }

        return false;
    }
}