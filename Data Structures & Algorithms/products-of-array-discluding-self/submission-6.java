class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zerosCount = 0;
        int[] result = new int[nums.length];

        for (int num : nums) {
            if (num == 0) {
                zerosCount++;
            } else {
                product *= num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zerosCount > 1) {
                result[i] = 0;
            } else if (zerosCount == 1) {
                if (nums[i] != 0) {
                    result[i] = 0;
                } else {
                    result[i] = product;
                }
            } else {
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}  
