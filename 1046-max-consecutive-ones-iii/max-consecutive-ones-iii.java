class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            int zero =0;
            for(int j=i;j<n;j++){
                if(arr[j]==0) zero++;
                if(zero<=k){
                    int len = j -i+1;
                    max = Math.max(max,len);
                }
                else break;
            }
        }
        return max;
    }
}