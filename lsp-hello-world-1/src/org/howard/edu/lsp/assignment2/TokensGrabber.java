
package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

public class TokensGrabber {

	public static void main(String[] args) {

	int sum = 0;
	int product = 1;
	String input = "";
	


	
	Scanner sc = new Scanner(System.in);
	
	while(!(input.equals("Goodbye"))){
		
		

		System.out.println("String?");
		input =  sc.nextLine();
		
		
		if (input.equals("Goodbye")) 
		{
			System.exit(0);
		}
		
		String[] brokentokens = input.split("\\s+");
		for (int i = 0; i < brokentokens.length; i ++) {
			sum += Integer.parseInt(brokentokens[i]);
			product *= Integer.parseInt(brokentokens[i]);
		}
	
		System.out.println("Tokens:");
	for (int i = 0; i < brokentokens.length; i ++) {
		System.out.println(brokentokens[i]);
		}
	System.out.println("Sum: " + sum);
	System.out.println("Product: " + product);
	}
	
		
		
	}


}
		
		

	


