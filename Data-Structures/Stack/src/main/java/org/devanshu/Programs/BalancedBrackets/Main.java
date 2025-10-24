package org.devanshu.Programs.BalancedBrackets;

public class Main {
    public static void main(String[] args) {
        BalancedBrackets bb = new BalancedBrackets();
        int totalTests = 0;
        int passedTests = 0;

        System.out.println("========== BALANCED BRACKETS TEST SUITE ==========\n");

        // Test Case 1: Empty string
        totalTests++;
        System.out.println("Test 1: Empty String");
        System.out.println("Input: \"\"");
        boolean result1 = bb.isBalanced("");
        System.out.println("Expected: true");
        System.out.println("Actual: " + result1);
        if (result1) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 2: Single opening bracket
        totalTests++;
        System.out.println("Test 2: Single Opening Bracket");
        System.out.println("Input: \"(\"");
        boolean result2 = bb.isBalanced("(");
        System.out.println("Expected: false");
        System.out.println("Actual: " + result2);
        if (!result2) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 3: Single closing bracket
        totalTests++;
        System.out.println("Test 3: Single Closing Bracket");
        System.out.println("Input: \")\"");
        boolean result3 = bb.isBalanced(")");
        System.out.println("Expected: false");
        System.out.println("Actual: " + result3);
        if (!result3) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 4: Balanced single pair
        totalTests++;
        System.out.println("Test 4: Balanced Single Pair");
        System.out.println("Input: \"()\"");
        boolean result4 = bb.isBalanced("()");
        System.out.println("Expected: true");
        System.out.println("Actual: " + result4);
        if (result4) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 5: Multiple balanced pairs
        totalTests++;
        System.out.println("Test 5: Multiple Balanced Pairs");
        System.out.println("Input: \"()()\"");
        boolean result5 = bb.isBalanced("()()");
        System.out.println("Expected: true");
        System.out.println("Actual: " + result5);
        if (result5) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 6: Nested brackets
        totalTests++;
        System.out.println("Test 6: Nested Brackets");
        System.out.println("Input: \"(())\"");
        boolean result6 = bb.isBalanced("(())");
        System.out.println("Expected: true");
        System.out.println("Actual: " + result6);
        if (result6) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 7: Complex nested and sequential
        totalTests++;
        System.out.println("Test 7: Complex Nested and Sequential");
        System.out.println("Input: \"((()))()\"");
        boolean result7 = bb.isBalanced("((()))()");
        System.out.println("Expected: true");
        System.out.println("Actual: " + result7);
        if (result7) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 8: Unbalanced - more opening
        totalTests++;
        System.out.println("Test 8: Unbalanced - More Opening Brackets");
        System.out.println("Input: \"(((\"");
        boolean result8 = bb.isBalanced("(((");
        System.out.println("Expected: false");
        System.out.println("Actual: " + result8);
        if (!result8) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 9: Unbalanced - more closing
        totalTests++;
        System.out.println("Test 9: Unbalanced - More Closing Brackets");
        System.out.println("Input: \"())\"");
        boolean result9 = bb.isBalanced("())");
        System.out.println("Expected: false");
        System.out.println("Actual: " + result9);
        if (!result9) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 10: Wrong order
        totalTests++;
        System.out.println("Test 10: Wrong Order");
        System.out.println("Input: \")(\"");
        boolean result10 = bb.isBalanced(")(");
        System.out.println("Expected: false");
        System.out.println("Actual: " + result10);
        if (!result10) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 11: Interleaved incorrect
        totalTests++;
        System.out.println("Test 11: Interleaved Incorrect");
        System.out.println("Input: \"(()\"");
        boolean result11 = bb.isBalanced("(()");
        System.out.println("Expected: false");
        System.out.println("Actual: " + result11);
        if (!result11) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 12: Long balanced string
        totalTests++;
        System.out.println("Test 12: Long Balanced String");
        System.out.println("Input: \"((((((()))))))\"");
        boolean result12 = bb.isBalanced("((((((()))))))");
        System.out.println("Expected: true");
        System.out.println("Actual: " + result12);
        if (result12) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Summary
        System.out.println("========== TEST SUMMARY ==========");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (totalTests - passedTests));
        System.out.println("Success Rate: " + (passedTests * 100.0 / totalTests) + "%");

        if (passedTests == totalTests) {
            System.out.println("\n🎉 All tests passed!");
        } else {
            System.out.println("\n⚠ Some tests failed. Please review the code.");
            System.out.println("\nNOTE: There's a bug in line 14 of BalancedBrackets.java:");
            System.out.println("Current: if (st.peek() == ')')");
            System.out.println("Should be: if (st.peek() == '(')");
        }
    }
}
