package ramondsb.challenge;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemB {
    // Generate all pairs and filter out sums that don't fit
    // TODO: Convert to int[][]
    public List<int[]> solution1(int[] arr, int target) {
        List<int[]> pairs = new ArrayList();

        // TODO: Check array size
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