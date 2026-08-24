class Solution {
    public int search(int[] arr, int tar) {
        int n = arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(arr[mid]== tar) return mid;
            if(arr[i]<=arr[mid]){
                if(tar < arr[mid] && tar >=arr[i]){
                    j=mid-1;
                }
                else i= mid+1;
            }
            else{
                if(tar >arr[mid] && tar<=arr[j]){
                    i=mid+1;
                }
                else j=mid-1;
            }
        }
        return -1;
        
    }
}