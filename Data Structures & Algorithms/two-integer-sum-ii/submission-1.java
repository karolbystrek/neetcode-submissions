class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < numbers.length; i++) {
        //     int num = numbers[i];
        //     Integer j = map.get(target - num);
        //     if (j != null) {
        //         return new int[] {j + 1, i + 1};
        //     }
        //     map.put(num, i);
        // }
        // return new int[] {0, 0};
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (target - (numbers[right] + numbers[left]) == 0) {
                return new int[] {left + 1, right + 1};
            }

            while (left < right && (target - (numbers[right] + numbers[left]) > 0)) {
                left++;
            }
            while (right > left && (target - (numbers[right] + numbers[left]) < 0)) {
                right--;
            }
        }
        return new int[] {1, 2};
    }
}
