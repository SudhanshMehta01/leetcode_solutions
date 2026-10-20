class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(!st.isEmpty() && ch == st.peek()){
                st.pop();
            }
            else st.push(ch);
        }
        for(char c : st){
            sb.append(c);
        }
        String ans = sb.toString();
        return ans;

        
    }
}