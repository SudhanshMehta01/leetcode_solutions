class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // frequency increase
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // maximum frequency
            maxFreq = Math.max(maxFreq, map.get(ch));

            // replacements needed > k
            while ((right - left + 1) - maxFreq > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }

            // maximum window length
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}