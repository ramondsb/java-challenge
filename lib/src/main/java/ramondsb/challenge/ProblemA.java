package ramondsb.challenge;

import java.util.Arrays;

public class ProblemA {
    /**
     * Description:
     * Receive an array A of N integer and return the smallest positive integer (bigger than 0)
     * that isn't present in A.
     *
     * Approach:
     * Sort array in ascending order.
     * Walk through elements from left to right checking if the succeeding element is present.
     * Check out base and boundary cases and special cases:
     *   - Missing 1 at beginning, complete array, repetitive and etc.
     * Time complexity is O(n)
     */
    public int solution1(int[] arr) {
        if (arr.length < 1) return 1;

        Arrays.sort(arr);

        int last = arr[0];

        if (last > 0 && last != 1) return 1;

        for (int i = 0; i < arr.length - 1; i++) {
            last = arr[i];
            if (last <= 0) continue;

            int diff = Math.abs(arr[i + 1] - arr[i]);

            if (arr[i + 1] <= 0) continue;

            if (diff > 1) return arr[i] + 1;

            last = arr[i + 1];
        }

        return (last <= 0) ? 1 : last + 1;
    }
}