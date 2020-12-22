package ramondsb.challenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemATest {
    @Test public void testSolution1Repeated() {
        ProblemA classUnderTest = new ProblemA();
        int[] input = {1, 3, 6, 4, 1, 2};
        int expectedOutput = 5;
        assertEquals(expectedOutput, classUnderTest.solution1(input));
    }

    @Test public void testSolution1OrderedSet() {
        Library classUnderTest = new Library();
        int[] input = {1, 2, 3};
        int expectedOutput = 4;
        assertEquals(expectedOutput, classUnderTest.problem1(input));
    }

    @Test public void testSolution1NegativeSet() {
        Library classUnderTest = new Library();
        int[] input = {-1, -3};
        int expectedOutput = 1;
        assertEquals(expectedOutput, classUnderTest.problem1(input));
    }
}