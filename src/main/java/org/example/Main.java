package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        tt.rotate(nums,k);

        System.out.println(Arrays.toString(nums));
    }
}