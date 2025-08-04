package package1;

import java.util.Scanner;

public class lab9 {

    public static String performOperation(String input, int choice) {
        if (choice == 1) {
            // Add the String to itself
            return input + input;

        } else if (choice == 2) {
            // Replace odd positions with #
            StringBuilder replaced = new StringBuilder(input);
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) { 
                    replaced.setCharAt(i, '#');
                }
            }
            return replaced.toString();

        } else if (choice == 3) {
            // Remove duplicate characters
            StringBuilder noDuplicates = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (noDuplicates.indexOf(String.valueOf(ch)) == -1) {
                    noDuplicates.append(ch);
                }
            }
            return noDuplicates.toString();

        } else if (choice == 4) {
            // Change odd characters to uppercase
            StringBuilder changed = new StringBuilder(input);
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    changed.setCharAt(i, Character.toUpperCase(input.charAt(i)));
                }
            }
            return changed.toString();

        } else {
            return "Invalid choice!";
        }
    }

    public static void main(String[] args) {
        String input = "example";
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the choice to perform operation"));
        int choice = sc.nextInt();            
        String result = performOperation(input, choice);
        System.out.println("Result: " + result);
    }
}


