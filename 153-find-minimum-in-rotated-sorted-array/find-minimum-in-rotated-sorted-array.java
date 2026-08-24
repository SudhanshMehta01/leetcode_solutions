class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int i=0,j=n-1;
        int min=Integer.MAX_VALUE;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(arr[mid]>=arr[j]) i=mid+1;
            else j=mid-1;
            min = Math.min(min,arr[mid]);
        }
        return min;
    }
}