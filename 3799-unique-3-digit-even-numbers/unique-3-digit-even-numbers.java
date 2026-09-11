class Solution {
    public int totalNumbers(int[] arr) {
        int n = arr.length;
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(i == k || j==k)continue;
                    ans = arr[i]*100 + arr[j]*10 +arr[k];
                    if(ans%2==0)set.add(ans);
                }
                
            }
        }
        return set.size();
    }
}