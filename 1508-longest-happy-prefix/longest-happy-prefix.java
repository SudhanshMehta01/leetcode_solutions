
class Solution {
    public String longestPrefix(String s) {
        int n = s.length();

        // LPS array store karega longest proper prefix
        // jo current substring ka suffix bhi ho
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Last LPS value answer ki length hai
        return s.substring(0, lps[n - 1]);
    }
}
