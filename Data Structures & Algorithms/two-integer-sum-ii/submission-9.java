class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            Integer diffIdx = map.get(target - numbers[i]);

            if (diffIdx != null) {
                return new int[]{diffIdx + 1, i + 1};
            }
            map.put(numbers[i], i);
        }

        return null;
    }
}
