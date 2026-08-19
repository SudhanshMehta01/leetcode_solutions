class Solution {
    public int minimumSum(int[] arr) {
        int n = arr.length;
        int ans=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]<arr[j]&&arr[k]<arr[j]){
                        ans = arr[i]+arr[j]+arr[k];
                        min = Math.min(ans,min);
                    }
                }
            }
            
        }
        if(min == Integer.MAX_VALUE) return -1;
        else return min;
    }
}