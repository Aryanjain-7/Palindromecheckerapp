public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if original and reversed strings are equal
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
