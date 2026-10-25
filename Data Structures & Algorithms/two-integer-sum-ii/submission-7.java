class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            Integer diffIdx = map.get(target - numbers[i]);

            if (diffIdx != null) {
                return new int[]{i + 1, diffIdx + 1};
            }
        }

        return null;
    }
}
