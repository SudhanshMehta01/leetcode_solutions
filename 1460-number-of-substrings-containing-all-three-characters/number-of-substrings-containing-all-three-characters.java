class Solution {
    public int numberOfSubstrings(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Window contains a, b and c
            while (map.size() == 3) {

                // All substrings starting from left
                // and ending from right to end are valid
                ans += s.length() - right;

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }
        }

        return ans;
    }
}