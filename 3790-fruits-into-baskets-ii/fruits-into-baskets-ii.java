class Solution {
    public int numOfUnplacedFruits(int[] arr, int[] brr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<=brr[j] && brr[j]!=0){
                    arr[i]=0;
                    brr[j]=0;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(brr[i]!=0) count++;
        }
        return count;
       
    }
}