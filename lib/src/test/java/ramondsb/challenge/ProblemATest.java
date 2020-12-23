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
        ProblemA classUnderTest = new ProblemA();
        int[] input = {1, 2, 3};
        int expectedOutput = 4;
        assertEquals(expectedOutput, classUnderTest.solution1(input));
    }

    @Test public void testSolution1NegativeSet() {
        ProblemA classUnderTest = new ProblemA();
        int[] input = {-1, -3};
        int expectedOutput = 1;
        assertEquals(expectedOutput, classUnderTest.solution1(input));
    }

    @Test public void testSolution1NoOne() {
        ProblemA classUnderTest = new ProblemA();
        int[] input = {2, 3, 4};
        int expectedOutput = 1;
        assertEquals(expectedOutput, classUnderTest.solution1(input));
    }

    @Test public void testSolution1ZeroElements() {
        ProblemA classUnderTest = new ProblemA();
        int[] input = {};
        int expectedOutput = 1;
        assertEquals(expectedOutput, classUnderTest.solution1(input));
    }

    @Test public void testSolution1Random() {
        ProblemA classUnderTest = new ProblemA();
        int[] input = {-1, -2, 1, 2, 3};
        int expectedOutput = 4;
        assertEquals(expectedOutput, classUnderTest.solution1(input));
    }
}