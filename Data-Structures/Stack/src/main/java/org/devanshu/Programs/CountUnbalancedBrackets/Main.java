package org.devanshu.Programs.CountUnbalancedBrackets;


public class Main {
    public static void main(String[] args) {
        CountUnbalancedBrackets obj = new CountUnbalancedBrackets();

        System.out.println("Test Case 1: Balanced brackets");
        obj.countUnbalancedBrackets("()");

        System.out.println("\nTest Case 2: Multiple balanced brackets");
        obj.countUnbalancedBrackets("()()");

        System.out.println("\nTest Case 3: Nested balanced brackets");
        obj.countUnbalancedBrackets("((()))");

        System.out.println("\nTest Case 4: Complex balanced brackets");
        obj.countUnbalancedBrackets("(()())");

        System.out.println("\nTest Case 5: Single opening bracket");
        obj.countUnbalancedBrackets("(");

        System.out.println("\nTest Case 6: Single closing bracket");
        obj.countUnbalancedBrackets(")");

        System.out.println("\nTest Case 7: Multiple opening brackets");
        obj.countUnbalancedBrackets("(((");

        System.out.println("\nTest Case 8: Multiple closing brackets");
        obj.countUnbalancedBrackets(")))");

        System.out.println("\nTest Case 9: More closing than opening");
        obj.countUnbalancedBrackets("())");

        System.out.println("\nTest Case 10: More opening than closing");
        obj.countUnbalancedBrackets("(()");

        System.out.println("\nTest Case 11: Mixed unbalanced");
        obj.countUnbalancedBrackets("((())");

        System.out.println("\nTest Case 12: Alternating unbalanced");
        obj.countUnbalancedBrackets(")()(");

        System.out.println("\nTest Case 13: Empty string");
        obj.countUnbalancedBrackets("");

        System.out.println("\nTest Case 14: Large balanced string");
        obj.countUnbalancedBrackets("(((())))");

        System.out.println("\nTest Case 15: Large unbalanced string");
        obj.countUnbalancedBrackets("(((())))(((");
    }
}