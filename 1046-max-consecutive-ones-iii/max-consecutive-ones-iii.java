class Solution {
    public int longestOnes(int[] arr, int k) {

        //BRUTE FORCE
        // int n = arr.length;
        // int max=0;
        // for(int i=0;i<n;i++){
        //     int zero =0;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]==0) zero++;
        //         if(zero<=k){
        //             int len = j -i+1;
        //             max = Math.max(max,len);
        //         }
        //         else break;
        //     }
        // }
        // return max;

        int n = arr.length;
        int left =0;
        int max =0;
        int zero=0;
        for(int right =0;right<n;right++){
            if(arr[right]==0) zero++;
            while(zero>k){
                if(arr[left]==0) zero--;
                left++;
            }
            int len = right - left +1;
            max = Math.max(max , len);
        }
        return max;


    }
}