package org.example;

public class Solution {

    /**
     * Rotates the given array of integers to the right by k positions.
     *
     * @param nums The array of integers to rotate.
     * @param k    The number of positions to rotate the array.
     */
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        // Normalize k because if k==len, it is the same as the input array
        if (k >= len) k = k % len;

        // Reverse the entire array
        reverse(nums, 0, len - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, len - 1);
    }

    /**
     * Reverses the elements of the array between the specified start and end indices (inclusive).
     *
     * @param array The array to reverse.
     * @param start The starting index of the range to reverse.
     * @param end   The ending index of the range to reverse.
     */
    private void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    /**
     * Swaps the elements at the specified indices in the given array.
     *
     * @param nums The array in which to swap elements.
     * @param i    The index of the first element to swap.
     * @param j    The index of the second element to swap.
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
