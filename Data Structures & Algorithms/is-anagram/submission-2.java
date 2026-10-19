class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            Integer currentCount = count.getOrDefault(c, 0);
            if (currentCount == 0) {
                return false;
            }
            count.put(c, currentCount - 1);
        }

        return true;
    }
}
