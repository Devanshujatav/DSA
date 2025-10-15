package in.devanshu.code.ReverseString;

public class StringReversal {
    // Method 1: Using character array and two pointers
    public String reverseUsingArray(String str){
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


    // Method 2: Using recursion
    public String reverseUsingRecursion(String str){
        if (str == null || str.length()<=1){
            return str;
        }

        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    // Method 3: Using a loop and string concatenation
    public String reverseUsingLoop(String str){
        // EDGE CASES
        if (str == null || str.length() <= 1){
            return str;
        }

        String reversedString = "";

        for (int i=str.length()-1 ; i>=0 ; i--){
            reversedString += str.charAt(i);
        }

        return reversedString;
    }

    // Method 4: Using character array with single loop
    public String reverseUsingSingleLoop(String str){

        // EDGE CASE
        if (str == null || str.length() <= 1){
            return str;
        }

        int len = str.length();

        char[] reversedString = new char[len];

        for (int i=0 ; i<len ; i++){
            reversedString[i] = str.charAt(len-1-i);
        }

        return new String(reversedString);
    }

    public String reverseUsingXOR(String str){
        // EDGE CASE
        if (str == null || str.length()<=1){
            return str;
        }

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length-1;

        // Method 5: Using XOR for character swapping (alternative to temp variable)
        while (left < right){
            // XOR swap (works for characters too)
            chars[left] ^= chars[right];
            chars[right] ^= chars[left];
            chars[left] ^= chars[right];

            left++;
            right--;
        }

        return new String(chars);
    }

}
