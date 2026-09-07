class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String end = strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),end.length());i++){
            if(first.charAt(i)!=end.charAt(i)) return ans.toString();
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}