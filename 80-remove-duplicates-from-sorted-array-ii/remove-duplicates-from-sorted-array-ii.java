class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        for(int x : map.keySet()){
            int count =  map.get(x);
            if(count==1) nums[i++]=x;
            if(count>=2){
                nums[i++]=x;
                nums[i++]=x;
            }
        }
        return i;

    }
}