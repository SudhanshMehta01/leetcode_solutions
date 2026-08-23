class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int i=0;
        int j=n-1;
        int mid=0;
        int ans=0;
        boolean report = true;
        while(i<=j){
            mid = i+(j-i)/2;
            if(arr[mid]==target){
                return mid;
                
            }
            else if(arr[mid]>target){
                j =mid-1;
                report = false;
            }
            else i = mid+1;
        }
        return i;
    }
}