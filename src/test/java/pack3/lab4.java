package pack3;

import java.util.Arrays;
import java.util.Scanner;

public class lab4 {

	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of product u want to store");
	int n=sc.nextInt();
	sc.nextLine();
	
	
	String[] products = new String[n];
	
	for(int i=0; i<n;i++) {
		System.out.println("Enter product name: " + (i+1));
		products[i]=sc.nextLine();
	
	}
	
	Arrays.sort(products);
	
	System.out.println("\n Sorted products name: ");
	for(String product: products) {
		System.out.println(product);
	}
	
	}
	
}

