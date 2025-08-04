package package1;
import java.util.Scanner;
public class lab10 {
	
	    public static boolean isPositiveString(String input) {
	        input = input.toUpperCase(); // for case-insensitive comparison

	        for (int i = 0; i < input.length() - 1; i++) {
	            if (input.charAt(i) > input.charAt(i + 1)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take input from the user
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Check and display result
	        if (isPositiveString(userInput)) {
	            System.out.println(userInput + " is a Positive String.");
	        } else {
	            System.out.println(userInput + " is NOT a Positive String.");
	        }

	        scanner.close();
	    }
	}



