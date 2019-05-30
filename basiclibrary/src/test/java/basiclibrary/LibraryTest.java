/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
    //This test portion is for analyzeWeatherData
    @Test
    public void testAnalyzeWeatherDataNormal() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {66, 64, 58, 65, 71, 57, 60},
        };

        String expectedOutput = "";
        expectedOutput += "High: 71\n";
        expectedOutput += "Low: 57\n";

        int[] missingNo = new int[] {59,61,62,63,67,68,69,70};

        for(int i = 0; i < missingNo.length; i++) {
            expectedOutput += "Never saw temperature: " + missingNo[i] + "\n";
        }

        assertEquals(expectedOutput, Library.analyzeWeatherData(weeklyMonthTemperatures));
    }

    @Test(expected = NoSuchElementException.class)
    public void testAnalyzeWeatherDataNull() {
        int[][] weeklyMonthTemperatures = {};

        String expectedOutput = "";

        int[] missingNo = new int[] {59,61,62,63,67,68,69,70};

        for(int i = 0; i < missingNo.length; i++) {
            expectedOutput += "Never saw temperature: " + missingNo[i] + "\n";
        }

        assertEquals(expectedOutput, Library.analyzeWeatherData(weeklyMonthTemperatures));
    }

    @Test
    public void testAnalyzeWeatherDataNoMissingNumber() {
        int[][] weeklyMonthTemperatures = {
                {66, 67, 68, 69, 70, 71, 72},
                {73, 74, 75, 76, 77, 78, 79},
        };

        String expectedOutput = "";
        expectedOutput += "High: 79\n";
        expectedOutput += "Low: 66\n";

        int[] missingNo = new int[] {};

        for(int i = 0; i < missingNo.length; i++) {
            expectedOutput += "Never saw temperature: " + missingNo[i] + "\n";
        }

        assertEquals(expectedOutput, Library.analyzeWeatherData(weeklyMonthTemperatures));
    }

    //this testing portion is for the tally method

    @Test
    public void testTallyNormal() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        votes.add("Shrub");

        List<String> expected = new ArrayList<>();
        expected.add("Bush");
        assertEquals(expected, Library.tally(votes));
    }

    @Test(expected = NoSuchElementException.class)
    public void testTallyNull() {
        List<String> votes = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, Library.tally(votes));
    }

    @Test
    public void testTallyMultipleWinners() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Shrub");

        List<String> expected = new ArrayList<>();
        expected.add("Bush");
        expected.add("Shrub");
        assertEquals(expected, Library.tally(votes));
    }
}
