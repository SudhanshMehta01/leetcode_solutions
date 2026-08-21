class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        // while(left < right){
        //     int height = Math.min(arr[left],arr[right]);
        //     int width = right - left;
        //     int current = height * width;
        //     max = Math.max(max,current);
        //     if(arr[left]<arr[right]) left++;
        //     else right--;
        // }
        for(int i=0;i<n;i++){
            int height = Math.min(arr[left],arr[right]);
            int width = right - left;
            int current = height * width;
            max = Math.max(max,current);
            if(arr[left]<arr[right]) left++;
            else right--;

        }
        return max;
    }
}