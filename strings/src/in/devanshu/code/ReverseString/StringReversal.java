package in.devanshu.code.ReverseString;

public class StringReversal {
    // Method 1: Using character array and two pointers
    public static String reverseUsingArray(String str){
        // EDGE CASE
        if (str == null || str.length() <= 1){
            return str;
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while (left < right){
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

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
    }
}
