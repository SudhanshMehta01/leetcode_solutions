class Solution {
    public int[] productExceptSelf(int[] arr) {

        //BRUTE FORCE
        // int n = arr.length;
        // int[] ans = new int[n];
        // for(int i =0;i<n;i++){
        //     int p =1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             p *= arr[j];
        //             ans[i]=p;
        //         }
        //     }
        // }
        // return ans;



        //optimal but space complexity
        // int n = arr.length;
        // int[] ans = new int[n];
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];
        // prefix[0]=1;
        // for(int i=1;i<n;i++){
        //     prefix[i] = prefix[i-1] * arr[i-1];
        // }
        // suffix[n-1]=1;
        // for(int i=n-2;i>=0;i--){
        //     suffix[i] = suffix[i+1] * arr[i+1];
        // }
        // for(int i=0;i<n;i++){
        //     ans[i] = prefix[i] * suffix[i];
        // }
        // return ans;


        int n = arr.length;
        int[] ans = new int[n];
        int suffix =1;
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix *= arr[i+1];
            ans[i] *= suffix;
        }
        return ans;


    }
}