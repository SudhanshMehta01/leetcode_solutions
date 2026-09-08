class Solution {
    public int maxDepth(String s) {
        int lvl =0;
        int max = Integer.MIN_VALUE;
        for(char ch : s.toCharArray()){
            if(ch == '(') lvl++;
            else if(ch == ')') lvl--;
            max = Math.max(max,lvl);
        }
        return max;
    }
}