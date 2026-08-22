class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int prefix =0;
            for(int j=i;j<n;j++){
                prefix += arr[j];
                if(prefix==goal)count++;
            }
        }
        return count;
    }
}