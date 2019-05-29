/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    //Testing portion for dice method
    @Test
    public void testRollLength() {
        int[] testRoll = Library.roll(6);
        assertEquals(6, testRoll.length);
    }

    @Test
    public void testZeroRoll() {
        int[] testRoll = Library.roll(0);
        assertEquals(0, testRoll.length);
    }

    @Test
    public void testUpperBoundary() {
        int[] testRoll = Library.roll(10);
        for(int i = 0; i < testRoll.length; i++) {
            assertTrue(testRoll[i] < 7);
        }
    }

    @Test
    public void testLowerBoundary() {
        int[] testRoll = Library.roll(10);
        for(int i = 0; i < testRoll.length; i++) {
            assertTrue(testRoll[i] > 0);
        }
    }

    //Testing portion for containsDuplicates method
    @Test
    public void testContainsDuplicatesTrue() {
        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 1};
        assertTrue("There are duplicates in here", Library.containsDuplicates(testArray));
    }

    @Test
    public void testContainsDuplicatesFalse() {
        int[] testArray = new int[]{1, 2, 3, 4, 5, 6};
        assertFalse("There are no duplicates", Library.containsDuplicates(testArray));
    }

    @Test
    public void testEmptyArray() {
        int[] testArray = new int[]{};
        assertFalse("The array is empty", Library.containsDuplicates(testArray));

    }

    //Testing portion for calculateAverage

    @Test
    public void testAverageValueInt() {
        int[] testArray = new int[]{1, 2, 3, 4, 5};
        assertEquals(3, Library.calculateAverage(testArray), 0);
    }

    @Test
    public void testAverageValueRational() {
        int[] testArray = new int[]{1, 2, 3, 4};
        assertEquals(2.5, Library.calculateAverage(testArray), 0);
    }

    @Test
    public void testEmptyAverage() {
        int[] testArray = new int[5];
        assertEquals(0, Library.calculateAverage(testArray), 0);
    }

    @Test
    public void testNullAverage() {
        int[] testArray = new int[0];
        assertEquals(0, Library.calculateAverage(testArray), 0);
    }

    @Test
    public void testAverageValueNegative() {
        int[] testArray = new int[]{-1, -2, -3, -4};
        assertEquals(-2.5, Library.calculateAverage(testArray), 0);
    }

    //This testing portion is for lowestAverage
    @Test
    public void testLowestAverage() {
        int[][] testArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(57, Library.lowestAverage(testArray), 0);
    }

    @Test
    public void testNullLowestAverage() {
        int[][] testArray = new int[][]{};
        assertEquals(0, Library.lowestAverage(testArray), 0);
    }

    @Test
    public void testNegativeLowestAverage() {
        int[][] testArray = {
                {-66, -64, -58, -65, -71, -57, -60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(-63, Library.lowestAverage(testArray), 0);
    }

    @Test
    public void testSingleNullArray() {
        int[][] testArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(57, Library.lowestAverage(testArray), 0);
    }
}
