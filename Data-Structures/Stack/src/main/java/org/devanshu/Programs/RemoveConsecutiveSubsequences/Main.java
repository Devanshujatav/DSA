package org.devanshu.Programs.RemoveConsecutiveSubsequences;

import java.util.Arrays;

public class Main {

    private static int totalTests = 0;
    private static int passedTests = 0;
    private static int failedTests = 0;

    public static void main(String[] args) {
        Main test = new Main();

        System.out.println("=== RemoveConsecutiveSubsequences Test Suite ===\n");

        test.testBasicConsecutiveDuplicates();
        test.testNoConsecutiveDuplicates();
        test.testAllElementsSame();
        test.testEmptyArray();
        test.testSingleElement();
        test.testTwoIdenticalElements();
        test.testTwoDifferentElements();
        test.testMultipleGroups();
        test.testAlternatingPattern();
        test.testDuplicatesAtStart();
        test.testDuplicatesAtEnd();
        test.testNegativeNumbers();
        test.testZeroValues();
        test.testLongConsecutiveSequence();
        test.testMixedPattern();
        test.testThreeConsecutiveDuplicates();
        test.testOrderPreservation();

        System.out.println("\n=== Test Summary ===");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests + " ✓");
        System.out.println("Failed: " + failedTests + " ✗");
        System.out.println("Success Rate: " + (totalTests > 0 ? (passedTests * 100.0 / totalTests) : 0) + "%");
    }

    private void testBasicConsecutiveDuplicates() {
        String testName = "Test removing consecutive duplicates - basic case";
        int[] input = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] expected = {1, 3, 5, 2};
        runTest(testName, input, expected);
    }

    private void testNoConsecutiveDuplicates() {
        String testName = "Test with no consecutive duplicates";
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        runTest(testName, input, expected);
    }

    private void testAllElementsSame() {
        String testName = "Test with all elements the same";
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {};
        runTest(testName, input, expected);
    }

    private void testEmptyArray() {
        String testName = "Test with empty array";
        int[] input = {};
        int[] expected = {};
        runTest(testName, input, expected);
    }

    private void testSingleElement() {
        String testName = "Test with single element";
        int[] input = {42};
        int[] expected = {42};
        runTest(testName, input, expected);
    }

    private void testTwoIdenticalElements() {
        String testName = "Test with two identical elements";
        int[] input = {7, 7};
        int[] expected = {};
        runTest(testName, input, expected);
    }

    private void testTwoDifferentElements() {
        String testName = "Test with two different elements";
        int[] input = {3, 5};
        int[] expected = {3, 5};
        runTest(testName, input, expected);
    }

    private void testMultipleGroups() {
        String testName = "Test with multiple groups of consecutive duplicates";
        int[] input = {1, 1, 2, 2, 3, 3};
        int[] expected = {};
        runTest(testName, input, expected);
    }

    private void testAlternatingPattern() {
        String testName = "Test with alternating pattern";
        int[] input = {1, 2, 1, 2, 1};
        int[] expected = {1, 2, 1, 2, 1};
        runTest(testName, input, expected);
    }

    private void testDuplicatesAtStart() {
        String testName = "Test with duplicates at start";
        int[] input = {1, 1, 2, 3, 4};
        int[] expected = {2, 3, 4};
        runTest(testName, input, expected);
    }

    private void testDuplicatesAtEnd() {
        String testName = "Test with duplicates at end";
        int[] input = {1, 2, 3, 4, 4};
        int[] expected = {1, 2, 3};
        runTest(testName, input, expected);
    }

    private void testNegativeNumbers() {
        String testName = "Test with negative numbers";
        int[] input = {-1, -1, -2, -3, -3, -3, 0};
        int[] expected = {-2, 0};
        runTest(testName, input, expected);
    }

    private void testZeroValues() {
        String testName = "Test with zero values";
        int[] input = {0, 0, 1, 2, 2, 0};
        int[] expected = {1, 0};
        runTest(testName, input, expected);
    }

    private void testLongConsecutiveSequence() {
        String testName = "Test with long consecutive sequence";
        int[] input = {1, 2, 2, 2, 2, 2, 2, 2, 3};
        int[] expected = {1, 3};
        runTest(testName, input, expected);
    }

    private void testMixedPattern() {
        String testName = "Test with mixed pattern";
        int[] input = {5, 5, 6, 7, 7, 8, 9, 9, 10};
        int[] expected = {6, 8, 10};
        runTest(testName, input, expected);
    }

    private void testThreeConsecutiveDuplicates() {
        String testName = "Test with three consecutive duplicates";
        int[] input = {1, 2, 2, 2, 3};
        int[] expected = {1, 3};
        runTest(testName, input, expected);
    }

    private void testOrderPreservation() {
        String testName = "Test order preservation";
        int[] input = {10, 20, 20, 30, 40, 40, 50};
        int[] expected = {10, 30, 50};
        runTest(testName, input, expected);
    }

    private void runTest(String testName, int[] input, int[] expected) {
        totalTests++;
        RemoveConsecutiveSubsequences remover = new RemoveConsecutiveSubsequences();

        try {
            // Clone input to preserve original for display
            int[] inputCopy = input.clone();
            int[] result = remover.remove(inputCopy);

            if (Arrays.equals(result, expected)) {
                passedTests++;
                System.out.println("✓ PASS: " + testName);
                System.out.println("  Input: " + Arrays.toString(input));
                System.out.println("  Output: " + Arrays.toString(result));
            } else {
                failedTests++;
                System.out.println("✗ FAIL: " + testName);
                System.out.println("  Input: " + Arrays.toString(input));
                System.out.println("  Expected: " + Arrays.toString(expected));
                System.out.println("  Got: " + Arrays.toString(result));
            }
        } catch (Exception e) {
            failedTests++;
            System.out.println("✗ FAIL: " + testName + " (Exception thrown)");
            System.out.println("  Input: " + Arrays.toString(input));
            System.out.println("  Exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println();
    }
}