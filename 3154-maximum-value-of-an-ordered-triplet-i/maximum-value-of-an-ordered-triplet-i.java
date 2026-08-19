class Solution {
    public long maximumTripletValue(int[] arr) {
        int n = arr.length;
        long max =0;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    long ans = (long) ((long)arr[i] - arr[j]) * arr[k];
                    max = Math.max(max,ans);
                }
            }
        }
        return max;
    }
}