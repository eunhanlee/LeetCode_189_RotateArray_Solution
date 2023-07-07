package org.example;

public class Solution2 {
    /**
     * Rotates the given array to the right by the specified number of steps.
     *
     * @param nums The array of integers to be rotated.
     * @param k    The number of steps to rotate the array to the right.
     */
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] tempNums = new int[len]; // Create a new array to store the rotated numbers

        for (int i = 0; i < len; i++) {
            tempNums[(i + k) % len] = nums[i]; // Rotate each number to the new position using modulo operator
        }

        System.arraycopy(tempNums, 0, nums, 0, len); // Copy the rotated numbers back to the original array
    }
}
