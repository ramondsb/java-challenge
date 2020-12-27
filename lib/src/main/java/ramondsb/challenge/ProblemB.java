package ramondsb.challenge;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemB {
    /**
     * Description:
     * Receive an ordered array of numbers and a number X. Return all
     * pair combinations that sums up to X.
     *
     * Approach:
     * The approach to solution1 basically generate all pairs
     * and filter out sums that don't fit. This has a time complexity of O(n^2).
     */
    public List<int[]> solution1(int[] arr, int target) {
        List<int[]> pairs = new ArrayList();

        if (arr.length == 0) return pairs;

        int[] previousPair = new int[] { arr[0], arr[0] };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int[] currentPair = { arr[i], arr[j] };
                if (Arrays.equals(currentPair, previousPair)) {
                    continue;
                }

                int pairSum = arr[i] + arr[j];
                if (pairSum == target) {
                    pairs.add(currentPair);
                }

                previousPair = currentPair;
            }
        }

        return pairs;
    }
}