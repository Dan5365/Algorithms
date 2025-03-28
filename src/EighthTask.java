public class EighthTask {
    public static void main(String[] args) {
        String s = "123456";
        System.out.println(isAllDigits(s, 0)); // Calling the recursive function
    }

    /**
     * Recursively checks if a string consists only of digits.
     * Time Complexity: O(n) - Checks each character once.
     * Space Complexity: O(n) - Due to recursive call stack.
     *
     * @param s The input string.
     * @param index The current position in the string.
     * @return true if all characters are digits, false otherwise.
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true; // Reached the end of the line — all characters are numbers
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false; // Found a non—digital character - false
        }
        return isAllDigits(s, index + 1); // Check the next character
    }
}
