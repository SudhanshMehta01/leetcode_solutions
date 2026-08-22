class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) arr[i]=0;
            else arr[i]=1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int prefix=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefix += arr[i];
            int need = prefix -k;
            if(map.containsKey(need)) count+= map.get(need);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}