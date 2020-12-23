package ramondsb.challenge;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProblemBTest {
    // TODO: Test repeatable valid pairs
    // TODO: Sort results
    @Test public void testSolution1() {
        ProblemB classUnderTest = new ProblemB();
        int target = 8;
        int[] input = {-2, -1, 0, 2, 4, 7, 8, 9, 9};
        List<int[]> expectedOutput =  new ArrayList(List.of(new int[]{-1, 9}, new int[]{0, 8}, new int[]{4, 4}));
        List<int[]> actualOutput = classUnderTest.solution1(input, target);
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }

    @Test public void testSolution1Empty() {
        ProblemB classUnderTest = new ProblemB();
        int target = 8;
        int[] input = {};
        List<int[]> expectedOutput =  new ArrayList();
        List<int[]> actualOutput = classUnderTest.solution1(input, target);
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }
}