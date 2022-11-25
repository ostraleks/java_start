package org.gigbrains;

public class Task3 {
    public int removeElement(int[] nums, int val) {
        int tmp = 0;
        for (final int num : nums) {
            if (num != val) {
                nums[tmp] = num;
                tmp++;
            }
            if (num == val && tmp < nums.length - 1) {
                nums[tmp] = nums[tmp + 1];
            }
        }
        return tmp;
    }
}
