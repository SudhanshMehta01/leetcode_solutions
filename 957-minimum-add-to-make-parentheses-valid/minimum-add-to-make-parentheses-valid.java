class Solution {
    public int minAddToMakeValid(String s) {

        int open = 0;
        int ans = 0;

        for(char ch : s.toCharArray()) {

            if(ch == '(') {
                open++;
            }
            else {
                if(open > 0) {
                    open--;       // ')' ko ek '(' mil gaya
                }
                else {
                    ans++;        // is ')' ke liye '(' add karna padega
                }
            }
        }

        return ans + open;
    }
}