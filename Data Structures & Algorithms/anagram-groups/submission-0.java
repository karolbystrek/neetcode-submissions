class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] strCount = new int[26];
            for (char c : str.toCharArray()) {
                strCount[c - 'a']++;
            }
            
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : strCount) {
                keyBuilder.append(count).append('#');
            }
            String key = keyBuilder.toString();
            map.computeIfAbsent(key, k -> new LinkedList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
