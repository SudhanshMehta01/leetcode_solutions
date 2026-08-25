class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=n+1;i++){
            int ans = k * i;
            if(!set.contains(ans)) return ans;
        }
        return -1;
        //ye bhi nhi hua mwrpe gawar hu m


        
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // int ans =k;
        // while(set.contains(ans)){
        //     ans+=k;
        // }
        // return ans;
       
    }
}