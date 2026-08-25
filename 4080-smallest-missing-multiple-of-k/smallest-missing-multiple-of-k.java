class Solution {
    public int missingMultiple(int[] nums, int k) {
        // int n = nums.length;
        // int min = Integer.MAX_VALUE;
        // int ans=0;

        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     set.add(nums[i]);
        // }
        // for(int i=1;i<=n;i++){
        //     ans = k * i;
        //     if(!set.contains(ans)) min= Math.min(min,ans);
        // }
        // return min;
        //ye bhi nhi hua mwrpe gawar hu m


        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans =k;
        while(set.contains(ans)){
            ans+=k;
        }
        return ans;
       
    }
}