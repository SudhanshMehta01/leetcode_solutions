class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int ans =0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int val = Math.abs(c - 'z');
            ans += (val+1) *(i+1);
        }
        return ans;
        
    }
}