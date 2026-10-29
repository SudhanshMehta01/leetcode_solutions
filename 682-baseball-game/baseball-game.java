
import java.util.*;

class Solution {
    public int calPoints(String[] arr) {
        int sum = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String ch = arr[i];

            if (ch.equals("C")) {
                st.pop(); // Last score cancel
            }
            else if (ch.equals("D")) {
                int x = st.peek();
                st.push(x * 2); // Double last score
            }
            else if (ch.equals("+")) {
                int a = st.get(st.size() - 1);
                int b = st.get(st.size() - 2);
                st.push(a + b); // Last two scores ka sum
            }
            else {
                st.push(Integer.parseInt(ch)); // String to integer
            }
        }

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}
