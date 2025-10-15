package in.devanshu.code.Palindrome;

import static in.devanshu.code.Palindrome.Palindrome.isPalindrome1;
import static in.devanshu.code.Palindrome.Palindrome.isPalindrome2;

public class Main {
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
                "racecar",
                "A man a plan a canal Panama",
                "race a car",
                "hello",
                "Madam",
                "Was it a car or a cat I saw",
                "No 'x' in Nixon",
                "",
                "a"
        };

        System.out.println("Palindrome Checker Results:");
        System.out.println("==========================");

        for (String test : testStrings) {
            System.out.printf("String: \"%s\"\n", test);
            System.out.printf("  Method 1 (Two Pointers): %s\n", isPalindrome1(test));
            System.out.printf("  Method 2 (StringBuilder): %s\n", isPalindrome2(test));
//            System.out.printf("  Method 3 (Recursion): %s\n", isPalindrome3(test));
//            System.out.printf("  Method 4 (Alpha Only): %s\n", isPalindromeAlphaOnly(test));
            System.out.println();
        }

        // Interactive input example
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String userInput = scanner.nextLine();

        if ((boolean) isPalindrome1(userInput)) {
            System.out.printf("\"%s\" is a palindrome!\n", userInput);
        } else {
            System.out.printf("\"%s\" is not a palindrome.\n", userInput);
        }

        scanner.close();
    }
}
