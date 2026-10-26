class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int left = 0;
        int right = 1;
        int longestSubstring = 1;

        Set<Character> set = new HashSet<>();
        set.add(s.charAt(left));

        while (left < s.length() - 1) {
            while (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }

            set.remove(s.charAt(left));
            left++;
            longestSubstring = Math.max(longestSubstring, right - left + 1);
        }

        return longestSubstring;
    }
}
