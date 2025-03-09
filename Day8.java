class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 1, index = 1, k = 0, temp;
        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {
                if (k == 1) {
                    temp = nums[index];
                    nums[index] = nums[right];
                    nums[right] = temp;
                    index++;
                } else {
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }

            } else if (nums[right] == 0 && nums[left] == 0 && k == 0) {
                index = left;
                k = 1;
            }
            left++;
            right++;
        }

    }
}
