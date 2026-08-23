class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // int n = arr.length;
        // Arrays.sort(arr);
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             for(int l=k+1;l<n;l++){
        //                 if(arr[i]+arr[j]+arr[k]+arr[l]==target){
        //                     // list.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
        //                     List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
        //                     if(!list.contains(temp)){
        //                         list.add(temp);
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        // return list;


        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum = (long)arr[i]+arr[j]+arr[left] +arr[right];
                    if(sum==target){
                        ans.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        
                        left++;
                        right--;
                        while(left<right && arr[left]==arr[left-1])left++;
                        while(left<right && arr[right]==arr[right+1])right--;

                    }
                    else if(sum<target)left++;
                    else right--;
                    
                }
            }
        }
        return ans;

    }
}