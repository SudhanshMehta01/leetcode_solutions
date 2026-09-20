class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int ans =0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int org = c - 'a' + 1;
            int ok = 27 - org;
            ans += ok*(i+1);
        }
        return ans;
        
    }
}