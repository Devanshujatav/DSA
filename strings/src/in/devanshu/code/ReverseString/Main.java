package in.devanshu.code.ReverseString;

public class Main {
    public static void main(String[] args) {

        String[] testStrings = {
                "Hello World",
                "Java Programming",
                "12345",
                "a",
                "",
                "racecar",
                "OpenAI"
        };

        StringReversal reverse = new StringReversal();

        for (String test : testStrings) {
            System.out.println("\nOriginal: \"" + test + "\"");
            System.out.println("Method 1 (Array):     \"" + reverse.reverseUsingArray(test) + "\"");
            System.out.println("Method 2 (Recursion): \"" + reverse.reverseUsingRecursion(test) + "\"");
            System.out.println("Method 3 (Loop):      \"" + reverse.reverseUsingLoop(test) + "\"");
            System.out.println("Method 4 (Single):    \"" + reverse.reverseUsingSingleLoop(test) + "\"");
            System.out.println("Method 5 (XOR):       \"" + reverse.reverseUsingXOR(test) + "\"");
        }
    }
}