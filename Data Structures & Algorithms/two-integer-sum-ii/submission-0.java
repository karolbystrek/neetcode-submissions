class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            Integer j = map.get(target - num);
            if (j != null) {
                return new int[] {j + 1, i + 1};
            }
            map.put(num, i);
        }
        return new int[] {0, 0};
    }
}
