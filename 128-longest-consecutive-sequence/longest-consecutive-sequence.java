import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Saare elements Set mein daalo
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int max = 0;

        // Unique elements ko traverse karo
        for(int current : set) {

            // Previous number nahi hai
            // Matlab current sequence ka starting point hai
            if(!set.contains(current - 1)) {

                int count = 1;

                // Next consecutive numbers check karo
                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}