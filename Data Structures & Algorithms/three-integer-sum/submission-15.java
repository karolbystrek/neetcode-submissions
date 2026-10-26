class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutions = new LinkedList();

        Arrays.sort(nums);

        for (int first = 0; first < nums.length - 2; first++) {

            // skip duplicates;
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int second = first + 1;
            int third = nums.length - 1;

            while (second < third) {
                if (nums[second] + nums[third] < -nums[first]) {
                    do {
                        second++;
                    } while (second < third && nums[second] == nums[second - 1]);
                } else if (nums[second] + nums[third] > -nums[first]) {
                    do {
                        third--;
                    } while (second < third && nums[third] == nums[third + 1]);
                } else {
                    solutions.add(List.of(nums[first], nums[second], nums[third]));
                    do {
                        second++;
                    } while (second < third && nums[second] == nums[second - 1]);
                    do {
                        third--;
                    } while (second < third && nums[third] == nums[third + 1]);
                }
            }
        }
        return solutions;
    }
}
