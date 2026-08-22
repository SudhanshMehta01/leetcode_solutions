class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        // int n = arr.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     int prefix =0;
        //     for(int j=i;j<n;j++){
        //         prefix += arr[j];
        //         if(prefix==goal)count++;
        //     }
        // }
        // return count;

        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        map.put(0,1);
        int prefix =0;
        int count =0;
        for(int i=0;i<n;i++){
            prefix += arr[i];
            int need = prefix - goal;
            if(map.containsKey(need)) count+= map.get(need);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}