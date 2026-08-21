class Solution {
    public boolean containsDuplicate(int[] arr) {
        // int n = arr.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // for(int x:map.keySet()){
        //     int count = map.get(x);
        //     if(count>1) return true;
            
        // }
        // return false;
        

        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num :arr){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
        
    }
}