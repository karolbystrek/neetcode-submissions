class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestConsecutive = 0;
        for (Integer value : set) {
            if (set.contains(value - 1)) {
                continue;   
            }
            int sequenceLength = 1;
            while (set.contains(value + sequenceLength)) {
                sequenceLength++;
            }
            longestConsecutive = Math.max(longestConsecutive, sequenceLength);
        }
        return longestConsecutive;
    }
}
