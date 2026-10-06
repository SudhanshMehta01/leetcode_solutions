class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            while(!st.isEmpty() && st.peek()>0 && current <0){
                if(st.peek()< -current) st.pop();
                else if(st.peek() == -current){
                    st.pop();
                    current =0;
                    break;
                }
                else{
                    current =0;
                    break;
                }
            }
            if(current!=0) st.push(current);
        }
        int[] ans = new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]= st.get(i);
        }
        return ans;
    }
}