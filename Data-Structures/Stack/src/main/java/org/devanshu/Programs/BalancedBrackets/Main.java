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
        System.out.println("Expected: true | Actual: " + result1);
        if (result1) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 2: Single opening bracket
        totalTests++;
        System.out.println("Test 2: Single Opening Bracket '('");
        boolean result2 = bb.isBalanced("(");
        System.out.println("Expected: false | Actual: " + result2);
        if (!result2) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 3: Single closing bracket
        totalTests++;
        System.out.println("Test 3: Single Closing Bracket ')'");
        boolean result3 = bb.isBalanced(")");
        System.out.println("Expected: false | Actual: " + result3);
        if (!result3) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 4: Balanced single pair - parentheses
        totalTests++;
        System.out.println("Test 4: Balanced Single Pair '()'");
        boolean result4 = bb.isBalanced("()");
        System.out.println("Expected: true | Actual: " + result4);
        if (result4) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 5: Balanced single pair - curly braces
        totalTests++;
        System.out.println("Test 5: Balanced Single Pair '{}'");
        boolean result5 = bb.isBalanced("{}");
        System.out.println("Expected: true | Actual: " + result5);
        if (result5) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 6: Balanced single pair - square brackets
        totalTests++;
        System.out.println("Test 6: Balanced Single Pair '[]'");
        boolean result6 = bb.isBalanced("[]");
        System.out.println("Expected: true | Actual: " + result6);
        if (result6) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 7: Multiple balanced pairs
        totalTests++;
        System.out.println("Test 7: Multiple Balanced Pairs '()[]{}");
        boolean result7 = bb.isBalanced("()[]{}");
        System.out.println("Expected: true | Actual: " + result7);
        if (result7) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 8: Nested brackets - same type
        totalTests++;
        System.out.println("Test 8: Nested Brackets '(())'");
        boolean result8 = bb.isBalanced("(())");
        System.out.println("Expected: true | Actual: " + result8);
        if (result8) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 9: Nested brackets - mixed types
        totalTests++;
        System.out.println("Test 9: Nested Mixed Brackets '({[]})'");
        boolean result9 = bb.isBalanced("({[]})");
        System.out.println("Expected: true | Actual: " + result9);
        if (result9) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 10: Complex nested and sequential
        totalTests++;
        System.out.println("Test 10: Complex Pattern '({})[({})]'");
        boolean result10 = bb.isBalanced("({})[({})]");
        System.out.println("Expected: true | Actual: " + result10);
        if (result10) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 11: Unbalanced - more opening
        totalTests++;
        System.out.println("Test 11: Unbalanced - More Opening '((('");
        boolean result11 = bb.isBalanced("(((");
        System.out.println("Expected: false | Actual: " + result11);
        if (!result11) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 12: Unbalanced - more closing
        totalTests++;
        System.out.println("Test 12: Unbalanced - More Closing '())'");
        boolean result12 = bb.isBalanced("())");
        System.out.println("Expected: false | Actual: " + result12);
        if (!result12) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 13: Wrong order
        totalTests++;
        System.out.println("Test 13: Wrong Order ')('");
        boolean result13 = bb.isBalanced(")(");
        System.out.println("Expected: false | Actual: " + result13);
        if (!result13) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 14: Mismatched brackets
        totalTests++;
        System.out.println("Test 14: Mismatched Brackets '(]'");
        boolean result14 = bb.isBalanced("(]");
        System.out.println("Expected: false | Actual: " + result14);
        if (!result14) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 15: Mismatched nested
        totalTests++;
        System.out.println("Test 15: Mismatched Nested '({)]'");
        boolean result15 = bb.isBalanced("({)]");
        System.out.println("Expected: false | Actual: " + result15);
        if (!result15) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 16: Interleaved incorrect
        totalTests++;
        System.out.println("Test 16: Interleaved Incorrect '(()'");
        boolean result16 = bb.isBalanced("(()");
        System.out.println("Expected: false | Actual: " + result16);
        if (!result16) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 17: Long balanced string
        totalTests++;
        System.out.println("Test 17: Long Balanced String");
        boolean result17 = bb.isBalanced("((((((()))))))");
        System.out.println("Expected: true | Actual: " + result17);
        if (result17) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 18: Complex real-world example
        totalTests++;
        System.out.println("Test 18: Complex Real-World '{[()()]}'");
        boolean result18 = bb.isBalanced("{[()()]}");
        System.out.println("Expected: true | Actual: " + result18);
        if (result18) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 19: Only opening brackets - mixed
        totalTests++;
        System.out.println("Test 19: Only Opening Brackets '({['");
        boolean result19 = bb.isBalanced("({[");
        System.out.println("Expected: false | Actual: " + result19);
        if (!result19) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 20: Only closing brackets - mixed
        totalTests++;
        System.out.println("Test 20: Only Closing Brackets ']})'");
        boolean result20 = bb.isBalanced("]})");
        System.out.println("Expected: false | Actual: " + result20);
        if (!result20) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 21: Single curly opening
        totalTests++;
        System.out.println("Test 21: Single Curly Opening '{'");
        boolean result21 = bb.isBalanced("{");
        System.out.println("Expected: false | Actual: " + result21);
        if (!result21) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 22: Single square closing
        totalTests++;
        System.out.println("Test 22: Single Square Closing ']'");
        boolean result22 = bb.isBalanced("]");
        System.out.println("Expected: false | Actual: " + result22);
        if (!result22) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 23: Deep nesting
        totalTests++;
        System.out.println("Test 23: Deep Nesting '{{{{{}}}}}'");
        boolean result23 = bb.isBalanced("{{{{{}}}}}");
        System.out.println("Expected: true | Actual: " + result23);
        if (result23) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 24: Alternating pattern
        totalTests++;
        System.out.println("Test 24: Alternating Pattern '()()()");
        boolean result24 = bb.isBalanced("()()()");
        System.out.println("Expected: true | Actual: " + result24);
        if (result24) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 25: Wrong closing for curly
        totalTests++;
        System.out.println("Test 25: Wrong Closing for Curly '{)'");
        boolean result25 = bb.isBalanced("{)");
        System.out.println("Expected: false | Actual: " + result25);
        if (!result25) {
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
        System.out.println("Success Rate: " + String.format("%.2f", (passedTests * 100.0 / totalTests)) + "%");

        if (passedTests == totalTests) {
            System.out.println("\n🎉 ALL TESTS PASSED!");
        } else {
            System.out.println("\n⚠️ SOME TESTS FAILED - REVIEW CODE");
        }
    }
}
