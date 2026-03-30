/**
 * HelloApp.java - A Java application that greets multiple users and uses
 * the substring method to handle string formatting.
 *
 * This is the sixth step (UC6) in the HelloApp journey. This version builds
 * on the enhanced for loop but changes the delimiter strategy. It appends
 * a comma and space to every name and then removes the final trailing
 * delimiter using the substring() method before printing.
 *
 * @author Ulkesh
 * @version 6.0
 */
/**
 * Key Java Concepts Used:
 * 1. StringBuilder - Used to accumulate names and delimiters efficiently.
 * 2. Enhanced For Loop - Iterates through all command-line arguments.
 * 3. substring() Method - Removes the final ", " by calculating the correct length.
 */
public class HelloApp {
    public static void main(String[] args) {
        String greeting;
        if (args.length > 0) {
            StringBuilder namesBuilder = new StringBuilder();
            // Step 5: Append each name followed by a comma and space
            for (String name : args) {
                namesBuilder.append(name).append(", ");
            }
            // Step 6: Use substring() to remove the trailing comma and space (last 2 chars)
            // namesBuilder.length() - 2 removes the last ", "
            String names = namesBuilder.substring(0, namesBuilder.length() - 2);
            greeting = "Hello, " + names + "!";
        } else {
            // Step 3: Default value if no arguments provided
            greeting = "Hello, World!";
        }
        // Step 7: Print the final greeting
        System.out.println(greeting);
    }
}