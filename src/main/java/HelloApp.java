/**
 * HelloApp.java - A Java application that greets multiple users using
 * an enhanced for loop to process command-line arguments.
 *
 * This is the fifth step (UC5) in the HelloApp journey. This version
 * demonstrates the use of the enhanced for loop (for-each) for cleaner
 * array traversal. It manually builds a comma-separated string from
 * the input arguments, or defaults to "World".
 *
 * @author Ulkesh
 * @version 5.0
 */
/**
 * Key Java Concepts Used:
 * 1. Enhanced For Loop (for-each) - Simplified syntax for iterating over arrays.
 * 2. StringBuilder - Efficiently building strings in a loop.
 * 3. Conditional Logic - Handling the default "World" case.
 */
public class HelloApp {
    public static void main(String[] args) {
        String nameText;
        if (args.length > 0) {
            // Using StringBuilder to efficiently join names
            StringBuilder namesBuilder = new StringBuilder();
            for (String name : args) {
                // Add a comma and space before every name except the first one
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
            nameText = namesBuilder.toString();
        } else {
            nameText = "World";
        }
        // Display the final personalized greeting
        System.out.println("Hello, " + nameText + "!");
    }
}