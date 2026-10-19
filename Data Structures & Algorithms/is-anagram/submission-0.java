class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            Integer occurances = map.get(c);
            if (occurances == null) {
                map.put(c, 1);
            } else {
                map.put(c, occurances + 1);
            }
        }

        for (char c : t.toCharArray()) {
            Integer occurances = map.get(c);
            if (occurances == null) {
                return false;
            } else {
                map.put(c, occurances - 1);
            }
        }

        return map.values().stream().filter(value -> value != 0).count() == 0;
    }
}
