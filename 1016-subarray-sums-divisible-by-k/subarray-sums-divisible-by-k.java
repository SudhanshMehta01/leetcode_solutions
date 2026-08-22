class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count=0;
        for(int i=0;i<n;i++){
            prefix += arr[i];
            int rem = (prefix % k + k) % k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}