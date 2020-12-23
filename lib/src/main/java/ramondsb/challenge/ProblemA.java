package ramondsb.challenge;

import java.util.Arrays;

public class ProblemA {

    public int solution1(int[] arr) {
        Arrays.sort(arr);
        int last = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);

            if (arr[i + 1] <= 0) continue;

            if (diff > 1) return arr[i] + 1;

            last = arr[i + 1];
        }

        return (last <= 0) ? 1 : last + 1;
    }
}