import java.util.*;

public class PalindromeCheckerApp {

    // UC3: String Reverse
    public static boolean reverseStringCheck(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // UC4: Char Array Two-Pointer
    public static boolean charArrayCheck(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    // UC5: Stack Based
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        for (char ch : str.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }

    // UC7: Deque Based
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string for performance test: ");
        String input = sc.nextLine();

        // UC3 timing
        long start = System.nanoTime();
        reverseStringCheck(input);
        long end = System.nanoTime();
        System.out.println("String Reverse (UC3) Time: " + (end - start) + " ns");

        // UC4 timing
        start = System.nanoTime();
        charArrayCheck(input);
        end = System.nanoTime();
        System.out.println("Char Array Two-Pointer (UC4) Time: " + (end - start) + " ns");

        // UC5 timing
        start = System.nanoTime();
        stackCheck(input);
        end = System.nanoTime();
        System.out.println("Stack Based (UC5) Time: " + (end - start) + " ns");

        // UC7 timing
        start = System.nanoTime();
        dequeCheck(input);
        end = System.nanoTime();
        System.out.println("Deque Based (UC7) Time: " + (end - start) + " ns");

        sc.close();
    }
}