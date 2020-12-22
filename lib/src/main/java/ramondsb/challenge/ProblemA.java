package ramondsb.challenge;

import java.util.Arrays;

public class ProblemA {

    public int solution1(int[] arr) {
        // Sort in ascending order
        Arrays.sort(arr);
        // Test when 1 is not present
        // Loop until end
        int last = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            // take difference i - (i + 1)
            int diff = Math.abs(arr[i + 1] - arr[i]);
            // if it is equal <=0, go to next
            //
            if (arr[i + 1] <= 0) continue;

            // If it is bigger then 1, return it as answer
            if (diff > 1) return arr[i] + 1;
            last = arr[i + 1];
        }

        if (last <= 0) {
            return 1;
        } else {
            return last + 1;
        }
    }
}